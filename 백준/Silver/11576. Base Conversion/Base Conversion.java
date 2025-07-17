import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = m; i > 0; i--) {
            int x = sc.nextInt();
            sum += (int) (Math.pow(A,i-1) * x);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (sum > 0) {
            list.add(sum % B);
            sum /= B;
        }
        Collections.reverse(list);
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
}