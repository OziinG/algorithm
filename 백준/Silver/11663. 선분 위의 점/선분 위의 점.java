import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] X = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
        }
        
        Arrays.sort(X);
        
        StringBuilder sb = new StringBuilder();
        while(M-- > 0){
            int left = sc.nextInt();
            int right = sc.nextInt();
            
            int leftIdx = lowerBound(X, left);
            int rightIdx = upperBound(X, right);
            
            int count = rightIdx - leftIdx;
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    
    private static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}