import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] timer = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) timer[i] = sc.nextInt()-1;
            else timer[i] = sc.nextInt() + timer[i-1];
        }
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (timer[j] >= t) {
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}