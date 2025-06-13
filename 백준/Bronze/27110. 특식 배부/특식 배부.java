import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];
        for (int i=0; i < 3; i++) {
            int x = sc.nextInt();
            if(x < n) arr[i] = x;
            else arr[i] = n;
        }
        int sum = arr[0] + arr[1] + arr[2];

        System.out.println(sum);
    }
}