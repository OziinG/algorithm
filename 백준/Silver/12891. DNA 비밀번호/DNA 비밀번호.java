import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        String dna = sc.next();
        int[] acgt = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Map<Character, Integer> acgtCount = new HashMap<>();
        int count = 0;
        for (int i = 0; i < P; i++) {
            char c = dna.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                acgtCount.put(c, acgtCount.getOrDefault(c, 0) + 1);
            }
        }
        if(acgtCheck(acgtCount, acgt)) count++;

        for (int i = 1; i <= S-P; i++) {
            char pre = dna.charAt(i-1);
            if (pre == 'A' || pre == 'C' || pre == 'G' || pre == 'T') {
                acgtCount.put(pre, acgtCount.getOrDefault(pre, 0) - 1);
            }
            char next = dna.charAt(i+P-1);
            if (next == 'A' || next == 'C' || next == 'G' || next == 'T') {
                acgtCount.put(next, acgtCount.getOrDefault(next, 0) + 1);
            }
            if(acgtCheck(acgtCount, acgt)) count++;
        }

        System.out.println(count);

    }

    private static boolean acgtCheck(Map<Character, Integer> acgtCount, int[] acgt) {
        return acgtCount.getOrDefault('A', 0) >= acgt[0] &&
               acgtCount.getOrDefault('C', 0) >= acgt[1] &&
               acgtCount.getOrDefault('G', 0) >= acgt[2] &&
               acgtCount.getOrDefault('T', 0) >= acgt[3];
    }
}