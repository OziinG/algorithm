import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        HashMap<String, Integer> rankSequenceCounts = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int[] universe = new int[n];
            Element[] elements = new Element[n];

            for (int j = 0; j < n; j++) {
                universe[j] = sc.nextInt();
                elements[j] = new Element(universe[j], j);
            }

            Arrays.sort(elements, Comparator.comparingInt(e -> e.value));

            int[] rank = new int[n];
            int currentRank = 0;
            for (int j = 0; j < n; j++) {
                if (j > 0 && elements[j].value > elements[j-1].value) {
                    currentRank++;
                }
                rank[elements[j].originalIndex] = currentRank;
            }

            StringBuilder sb = new StringBuilder();
            for (int r : rank) {
                sb.append(r);
            }
            String rankStr = sb.toString();

            rankSequenceCounts.put(rankStr, rankSequenceCounts.getOrDefault(rankStr, 0) + 1);
        }

        long totalSimilarPairs = 0;
        for (int count : rankSequenceCounts.values()) {
            if (count >= 2) {
                totalSimilarPairs += (long) count * (count - 1) / 2;
            }
        }

        System.out.println(totalSimilarPairs);
        sc.close();
    }

    static class Element {
        int value;
        int originalIndex;

        Element(int value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }
}