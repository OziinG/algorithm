import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int x = sc.nextInt();
            boolean ans = false;
            for (int i=2; i <=64; i ++) {
                ArrayList<Integer> baseDigit = convertBase(x, i);
                if(isPalindrome(baseDigit)) {
                    ans = true;
                    break;
                }
            }
        System.out.println(ans ? "1" : "0");
        }
    }

    private static boolean isPalindrome(ArrayList<Integer> baseDigit) {
        if (baseDigit.size() / 2 == 0) {
            for (int i = 0; i < baseDigit.size() / 2; i++) {
                if (!baseDigit.get(i).equals(baseDigit.get(baseDigit.size() - 1 - i))) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 0; i < baseDigit.size() / 2; i++) {
                if (!baseDigit.get(i).equals(baseDigit.get(baseDigit.size() - 1 - i))) {
                    return false;
                }
            }
            return true;

        }
    }

    private static ArrayList<Integer> convertBase(int x, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(x % i);
            x /= i;
        } while (x != 0);
        return list;
    }
}