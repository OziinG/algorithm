import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.toUpperCase().equals("N")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}