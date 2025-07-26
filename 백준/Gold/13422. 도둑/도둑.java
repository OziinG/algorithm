import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();

            int[] house = new int[N];
            long totalMoney = 0;
            for (int i = 0; i < N; i++) {
                house[i] = sc.nextInt();
                totalMoney += house[i];
            }

            if (N == M) {
                if (totalMoney < K) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                continue;
            }

            int[] houseExtended = new int[2 * N];
            for (int i = 0; i < N; i++) {
                houseExtended[i] = houseExtended[i + N] = house[i];
            }

            int count = 0;
            long money = 0;

            for (int i = 0; i < M; i++) {
                money += houseExtended[i];
            }

            if (money < K) {
                count++;
            }

            for (int i = 1; i < N; i++) {
                money -= houseExtended[i - 1];
                money += houseExtended[i + M - 1];
                if (money < K) {
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}