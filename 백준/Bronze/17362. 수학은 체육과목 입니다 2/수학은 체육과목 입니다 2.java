import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%8 == 0){
            System.out.println(2);
        }
        else if(n%8 <= 5){
            System.out.println(n%8);
        }
        else {
            System.out.println(10-n%8);
        }
    }
}