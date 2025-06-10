import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int starIdx = input.indexOf('*');
        for (int x = 0; x <= 9; x++) {
            int sum = 0;
            for (int i = 0; i < 13; i++) {
                int num;
                if (i == starIdx) {
                    num = x;
                } else {
                    num = input.charAt(i) - '0';
                }
                if (i % 2 == 0) {
                    sum += num;
                } else {
                    sum += 3 * num;
                }
            }
            if (sum % 10 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}

