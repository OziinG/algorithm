import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int values = 1;
        int count = 0;
        while (n > 0) {
            if(n >= values) {
                n -= values;
                values++;
                count ++;
            } else {
                values = 1;
                n -= values;
                values++;
                count ++;
            }
        }
        System.out.println(count);
    }
}