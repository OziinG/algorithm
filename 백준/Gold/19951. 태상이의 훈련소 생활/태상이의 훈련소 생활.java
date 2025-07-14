import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] ground = new int[N+1];
        for (int i = 1; i <= N; i++) {
            ground[i] = sc.nextInt();
        }

        int[] diff = new int[N+2];
        while(M-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            diff[a] += k;
            diff[b+1] -= k;
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += diff[i];
            System.out.print(ground[i] + sum + " ");
        }
    }
}