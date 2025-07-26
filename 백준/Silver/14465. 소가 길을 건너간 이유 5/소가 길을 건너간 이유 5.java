import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt(), B = sc.nextInt();

        boolean[] trafficLight = new boolean[N];

        Arrays.fill(trafficLight, true);

        for (int i = 0; i < B; i++) {
            trafficLight[sc.nextInt() - 1] = false;
        }
        int l = 0, r = 0;
        int brokenCount = 0;
        int minRepair = Integer.MAX_VALUE;

        while (r < N) {
            if (!trafficLight[r]) brokenCount++;

            if (r - l + 1 == K) {
                minRepair = Math.min(minRepair, brokenCount);

                if (!trafficLight[l]) brokenCount--;
                l++;
            }
            r++;
        }
        System.out.println(minRepair);
    }
}