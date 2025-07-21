import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 0;
        int currentSum = 0;
        int minLen = Integer.MAX_VALUE;

        while (right < N) {
            currentSum += arr[right];
            right++;

            while (currentSum >= S) {
                minLen = Math.min(minLen, right - left);
                currentSum -= arr[left];
                left++;
            }
        }

        System.out.println((minLen == Integer.MAX_VALUE) ? 0 : minLen);
    }
}