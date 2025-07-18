import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] lines = new int[K];
        for (int i = 0; i < K; i++) {
            lines[i] = sc.nextInt();
        }

        long left = 1, right = Arrays.stream(lines).max().orElse(0);
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = calcLineCount(lines, mid);

            if (count >= N) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }

        System.out.println(answer);
        sc.close();
    }

    public static long calcLineCount(int[] lines, long length) {
        long count = 0;
        for (int line : lines) {
            count += line / length;
        }
        return count;
    }
}