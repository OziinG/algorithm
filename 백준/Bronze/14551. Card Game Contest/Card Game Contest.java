import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long countMethod = 1;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            countMethod *= (x == 0) ? 1 : x;
            countMethod %= M;
        }

        System.out.println(countMethod%M);

    }
}