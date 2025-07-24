import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        int maxLen = 0;
        int l = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);

            while (charCount.size() > N) {
                char leftChar = s.charAt(l);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        System.out.println(maxLen);
    }
}