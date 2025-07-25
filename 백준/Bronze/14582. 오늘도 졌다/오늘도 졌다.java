import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] jemi = new int[9];
        int[] start = new int[9];

        for (int i = 0; i < 9; i++) {
            jemi[i] = sc.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            start[i] = sc.nextInt();
        }
        int sumJ = 0;
        int sumS = 0;
        boolean ans =  true;

        for (int i = 0; i < 9; i++) {
            sumJ += jemi[i];
            if(sumJ > sumS) {
                ans = false;
                break;
            }
            sumS += start[i];

        }
        System.out.println(ans? "No" : "Yes");


    }
}