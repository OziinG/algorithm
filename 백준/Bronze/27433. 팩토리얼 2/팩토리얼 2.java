import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long ans = Main.factorial(n);
        System.out.println(ans);
    }

    private static Long factorial(int n) {
        if(n == 0 || n == 1) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }
}

