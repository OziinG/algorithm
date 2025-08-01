import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        char[] naming = s.toCharArray();

        Set<Character> unique = new HashSet<>();
        StringBuilder result = new StringBuilder();
        int removedCount = 0;

        for (char c : naming) {
            if (!unique.contains(c)) {
                unique.add(c);
                result.append(c);
            } else {
                removedCount++;
            }
        }
        result.append(4+removedCount);
        result.insert(0, 1906+N);

        result.reverse();

        result.insert(0, "smupc_");

        System.out.println(result.toString());

        sc.close();
    }
}