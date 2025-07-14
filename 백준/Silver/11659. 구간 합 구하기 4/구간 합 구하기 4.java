import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }
        while(M-- >0){
            int start = sc.nextInt();
            int end = sc.nextInt();

            System.out.println(arr[end]-arr[start-1]);
        }

    }
}