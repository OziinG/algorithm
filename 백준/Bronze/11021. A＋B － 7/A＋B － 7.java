import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int caseNum = 1;
        while(T-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            int sum = x + y;
            System.out.println("Case #" + caseNum + ": " + sum);
            caseNum++;
        }
    }
}