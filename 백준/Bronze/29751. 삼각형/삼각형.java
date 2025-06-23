import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        float tri = (float) (n * h) /2;

        System.out.printf("%.1f", tri);
    }
}