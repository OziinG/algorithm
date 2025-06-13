import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("M")) System.out.println("MatKor");
        if(input.equals("W")) System.out.println("WiCys");
        if(input.equals("C")) System.out.println("CyKor");
        if(input.equals("A")) System.out.println("AlKor");
        if(input.equals("$")) System.out.println("$clear");
    }
}