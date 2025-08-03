import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] X = new int[N];

            for (int i = 0; i < N; i++) {
                X[i] = sc.nextInt();
            }

            int maxSubArray = X[0];
            int currentSum = X[0];

            for (int i = 1; i < N; i++) {
                currentSum = Math.max(X[i], currentSum + X[i]);
                maxSubArray = Math.max(maxSubArray, currentSum);
            }

            System.out.println(maxSubArray);
        }
        sc.close();
    }
}