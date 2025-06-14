import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < n; i++) {
            int count = 0;
            int testCase = sc.nextInt();
            for (int j = 0; j < 20; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < j; k++) {
                    if(arr[k] > arr[j]) {
                        count++;
                    }
                }
            }
            System.out.println(testCase + " " + count);
        }
    }
}