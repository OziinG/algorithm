import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= T; i++) {
            if (T % i == 0) {
                divisors.add(i);
            }
        }
        int totalCount = 0;
        for (int i = 0; i < N; i++) {
            int light = sc.nextInt();
            if (T % light == 0) {
                continue;
            }
            int minDiff = Integer.MAX_VALUE;
            for (int divisor : divisors) {
                int diff = Math.abs(light - divisor);
                minDiff = Math.min(minDiff, diff);
            }
            totalCount += minDiff;
        }

        System.out.println(totalCount);
        sc.close();
    }
}