import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, 1);
        }
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            if (map.containsKey(target)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.print(sb);
        sc.close();
    }
}