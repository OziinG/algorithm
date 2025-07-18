import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        System.out.println(calcSqrtInteger(N));
    }

    static long calcSqrtInteger(long n) {
        if (n == 0) return 0;
        long l = 1, r = 1L << 32, sqrt = -1;

        while (l <= r) {
            long m = (l + r) / 2;
            if (m >= (n - 1) / m + 1) {
                r = m - 1;
                sqrt = m;
            } else l = m + 1;
        }
        return sqrt;
    }
}