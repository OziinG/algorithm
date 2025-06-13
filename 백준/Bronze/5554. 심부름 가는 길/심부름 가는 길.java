import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sec = a + b + c + d;
        int min = sec / 60;
        sec = sec % 60;
        System.out.println(min);
        System.out.println(sec);
    }
}