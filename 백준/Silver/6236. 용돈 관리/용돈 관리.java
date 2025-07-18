import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] schedule = new int[N];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int cash = sc.nextInt();
            schedule[i] = cash;
            sum += cash;
            max = Math.max(max, cash);
        }
        int l = max, r = sum, K = sum;
        while (l <= r) {
            int m = (l + r) / 2;
            if (countDraw(schedule, m) <= M) {
                K = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        System.out.println(K);
    }
    static int countDraw(int[] schedule, int m) {
        int count = 1;
        int rem = m;
        for(int item : schedule) {
            if (item > rem) {
                count++;
                rem = m - item;
            } else {
                rem -= item;
            }
        }
        return count;
    }
}