import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] p = new double[10];
        for (int i = 0; i < 10; i++) {
            p[i] = sc.nextDouble();
        }
        Arrays.sort(p);
        double result = 1.0;
        for (int i = 1; i <= 9; i++) {
            result *= p[i] / i;
        }
        System.out.printf("%.10f\n", result * 1_000_000_000);
    }
}