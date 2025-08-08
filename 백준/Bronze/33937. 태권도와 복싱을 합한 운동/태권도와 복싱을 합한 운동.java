import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int idxA = findCase(A);
        int idxB = findCase(B);

        if (idxA != -1 && idxB != -1) {
            String compound = A.substring(0, idxA + 1) + B.substring(0, idxB + 1);
            System.out.println(compound);
        } else {
            System.out.println("no such exercise");
        }
    }

    static int findCase(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (isVowel(s.charAt(i)) && !isVowel(s.charAt(i + 1))) {
                return i;
            }
        }
        return -1;
    }

    static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}