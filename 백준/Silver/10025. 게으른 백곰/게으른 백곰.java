import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();

        int[][] bucket = new int[N][2];

        for (int i = 0; i < N; i++) {
            bucket[i][1] = sc.nextInt();
            bucket[i][0] = sc.nextInt();
        }

        Arrays.sort(bucket, (a, b) -> Integer.compare(a[0], b[0]));

        int l = 0, r = 0;
        int ice = 0;
        int maxIce = 0;

        while(r < N){
            ice += bucket[r][1];

            while(bucket[r][0] - bucket[l][0] > 2*K){
                ice -= bucket[l][1];
                l++;
            }

            maxIce = Math.max(maxIce, ice);
            r++;
        }


        System.out.println(maxIce);
    }
}