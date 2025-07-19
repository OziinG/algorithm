import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] house = new int[N];
        for (int i = 0; i < N; i++) {
            house[i] = sc.nextInt();
        }
        Arrays.sort(house);

        int l = 1, r = house[N-1] - house[0], minDist = 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if(isVaildDist(house, m, C)) {
                minDist = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println(minDist);
    }

    static boolean isVaildDist(int[] h, int d, int c) {
        int pastX = h[0];
        int cnt = 1;
        for (int j : h) {
            if (j - pastX >= d) {
                pastX = j;
                cnt++;
            }
        }
        return cnt >= c;
    }
}