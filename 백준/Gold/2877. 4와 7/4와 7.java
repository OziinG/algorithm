import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        int digits = 1;
        int totalCount = 0;
        while (totalCount + (int) Math.pow(2, digits) < K) {
            totalCount += (int) Math.pow(2, digits);
            digits++;
        }

        int position = K - totalCount;

        StringBuilder result = new StringBuilder();
        for (int i = digits - 1; i >= 0; i--) {
            if (((position - 1) & (1 << i)) != 0) {
                result.append('7');
            } else {
                result.append('4');
            }
        }

        System.out.println(result.toString());
    }
}