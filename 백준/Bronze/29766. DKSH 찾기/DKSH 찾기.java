import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dksh = sc.nextLine();
        int lenBefore = dksh.length();
        dksh = dksh.replace("DKSH", "");
        int lenAfter = dksh.length();
        int count = lenBefore - lenAfter;
        System.out.println(count/4);
    }
}