import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> order = new HashMap<>();
        int orderIndex = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (!order.containsKey(num)) {
                order.put(num, orderIndex++);
            }
        }

        List<Integer> nums = new ArrayList<>(freq.keySet());
        nums.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a);
            }
            return order.get(a) - order.get(b);
        });

        for (int num : nums) {
            for (int i = 0; i < freq.get(num); i++) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}