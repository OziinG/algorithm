import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((y/x)%2 ==0) System.out.println(y%x + x);
        else System.out.println((y%x == 0) ? y : y%x);
    }
}