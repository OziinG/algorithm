import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Character> arr = new ArrayList<>();
        while(n>0){
            int rem = n % b;
            if (rem < 10) arr.add((char)(rem + '0'));
            else arr.add((char)(rem - 10 + 'A'));
            n /= b;
        }
        for(int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }

    }
}