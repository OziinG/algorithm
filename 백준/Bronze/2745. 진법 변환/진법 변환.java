import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0';
            } else {
                digit = c - 'A' + 10;
            }
            result = result * B + digit;
        }

        System.out.println(result);
    }
}