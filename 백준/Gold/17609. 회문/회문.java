import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String test = sc.next();
            if (isPalindrome(test)) System.out.println(0);
            else if (isLikelyPalindrome(test)) System.out.println(1);
            else System.out.println(2);
        }
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    static boolean isLikelyPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(left + 1, right + 1)) ||
                        isPalindrome(s.substring(left, right));
            }
            left++;
            right--;
        }
        return true;
    }
}