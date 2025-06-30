import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pow = 1;
        while (pow * 2 <= n) {
            pow *= 2;
        }


        if (n == pow) {
            System.out.println(n);
        } else {
            System.out.println(2 * (n - pow));
        }
    }
}