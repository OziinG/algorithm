import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = sc.nextInt();
        }
        Arrays.sort(trees);
        int H = vaildHeight(trees, N, M);
        System.out.println(H);
    }

    static int vaildHeight(int[] trees, int N, int M) {
        int l = 0, r = trees[N - 1], H = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.max(trees[i] - m, 0);
            }
            if (sum >= M) {
                l = m + 1;
                H = m;
            } else r = m - 1;
        }
        return H;
    }
}