import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 2) {
            System.out.println(n);
            return;
        }

        int a = 1; 
        int b = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = (a + b) % 10;
            a = b;
            b = current;
        }

        System.out.println(b);
    }
}