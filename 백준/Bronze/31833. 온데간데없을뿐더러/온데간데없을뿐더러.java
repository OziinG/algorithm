import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String xStr = sc.nextLine().strip().replace(" ", "");
        String yStr = sc.nextLine().strip().replace(" ", "");
        long xSum = Long.parseLong(xStr);
        long ySum = Long.parseLong(yStr);
        System.out.println(Math.min(xSum, ySum));
    }
}