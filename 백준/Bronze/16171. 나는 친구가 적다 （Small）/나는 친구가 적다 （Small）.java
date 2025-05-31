import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String keyword = sc.nextLine();
        String output = s.replaceAll("[0-9]", "");
        if (output.contains(keyword)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
