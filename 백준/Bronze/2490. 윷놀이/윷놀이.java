import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<3;i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            int sum = a + b + c + d;
            if (sum == 4) System.out.println("E");
            if (sum == 3) System.out.println("A");
            if (sum == 2) System.out.println("B");
            if (sum == 1) System.out.println("C");
            if (sum == 0) System.out.println("D");
        }

    }
}