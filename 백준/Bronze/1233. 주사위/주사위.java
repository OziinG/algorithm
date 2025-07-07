import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int[] count = new int[s1 + s2 + s3 + 1];
        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    count[i + j + k]++;
                }
            }
        }

        int max = 0, answer = 0;
        for (int i = 3; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
            }
        }
        System.out.println(answer);
    }
}