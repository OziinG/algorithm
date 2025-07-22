import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        int r = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int l = 0; l < N; l++) {
            while (r < N && A[r] - A[l] < M) {
                r++;
            }
            if( r == N ) {
                break;
            }

            minDiff = Math.min(minDiff, A[r] - A[l]);
        }
        System.out.println(minDiff);
    }
}