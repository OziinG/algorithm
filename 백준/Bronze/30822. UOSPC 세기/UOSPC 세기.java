import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        char[] required = {'u', 'o', 's', 'p', 'c'};
        for (int i = 0; i < n; i++) {
            for (char ch : required) {
                if (c[i] == ch) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                    break;
                }
            }
        }

        int minCount = Integer.MAX_VALUE;

        for (char ch : required) {
            int count = map.getOrDefault(ch, 0);
            if (count == 0) {
                minCount = 0;
                break;
            }
            minCount = Math.min(count, minCount);
        }

        System.out.println(minCount);
    }
}