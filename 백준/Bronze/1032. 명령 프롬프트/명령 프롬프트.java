import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String first = sc.next();
        int length = first.length();
        char[] result = first.toCharArray();

        for (int i = 1; i < n; i++) {
            String current = sc.next();
            for (int j = 0; j < length; j++) {
                if (result[j] != '?' && result[j] != current.charAt(j)) {
                    result[j] = '?';
                }
            }
        }

        System.out.println(new String(result));
    }
}