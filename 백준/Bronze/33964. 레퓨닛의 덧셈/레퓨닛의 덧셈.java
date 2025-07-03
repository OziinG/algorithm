import java.util.Scanner;
import java.math.BigInteger;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        BigInteger repunitX = calculateRepunit(x);
        BigInteger repunitY = calculateRepunit(y);

        System.out.println(repunitX.add(repunitY));
    }

    private static BigInteger calculateRepunit(int n) {
        BigInteger ten = BigInteger.TEN;
        BigInteger one = BigInteger.ONE;
        BigInteger nine = BigInteger.valueOf(9);

        return ten.pow(n).subtract(one).divide(nine);
    }
}