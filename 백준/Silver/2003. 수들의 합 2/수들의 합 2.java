import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int right = 0;
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            if (i > 0) {
                currentSum -= arr[i-1];
            }
            while (right < N && currentSum < M) {
                currentSum += arr[right];
                right++;
            }

            if (currentSum == M) {
                count++;
            }
        }

        System.out.println(count);
    }
}