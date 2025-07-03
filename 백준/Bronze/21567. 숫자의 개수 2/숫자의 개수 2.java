import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = sc.nextBigInteger();

        String times = String.valueOf(A.multiply(B).multiply(C));

        for(int i = 0; i <= 9; i++) {
            int count = 0;
            for(int j = 0; j < times.length(); j++) {
                if (Character.getNumericValue(times.charAt(j)) == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}