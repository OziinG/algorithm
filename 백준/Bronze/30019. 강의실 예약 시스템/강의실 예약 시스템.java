import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] lastEnd = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int s = sc.nextInt();
            int e = sc.nextInt();
            if (lastEnd[k] <= s) {
                System.out.println("YES");
                lastEnd[k] = e;
            } else {
                System.out.println("NO");
            }
        }
    }
}