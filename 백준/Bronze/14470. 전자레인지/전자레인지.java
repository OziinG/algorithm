import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int time = 0;

        if (A > 0) {
            System.out.println((B - A) * E);
        } else {
            System.out.println(Math.abs(A) * C + D + B * E);
        }
    }
}