import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println((N == 0) ? 0 : fibonacci(N));
    }

    private static int fibonacci(int n) {
        int[] fiboN = new int[n+1];
        fiboN[0] = 0;
        fiboN[1] = 1;
        for (int i = 2; i <= n; i++) {
            fiboN[i] = fiboN[i-1] + fiboN[i-2];
        }
        return fiboN[n];
    }
}