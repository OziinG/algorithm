import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        HashMap<Character, Integer> votedStaff = new HashMap<>();
        ArrayList<Character> staffList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Character staff = sc.next().charAt(0);
            int vote = sc.nextInt();

            if (vote >= x * 0.05) {
                votedStaff.put(staff, vote);
                staffList.add(staff);
            }
        }

        Collections.sort(staffList);

        ArrayList<ScoreInfo> allScores = new ArrayList<>();

        for (Character staff : staffList) {
            int vote = votedStaff.get(staff);
            for (int div = 1; div <= 14; div++) {
                double score = (double) vote / div;
                allScores.add(new ScoreInfo(staff, score));
            }
        }

        Collections.sort(allScores, (a, b) -> Double.compare(b.score, a.score));

        HashMap<Character, Integer> chips = new HashMap<>();
        for (Character staff : staffList) {
            chips.put(staff, 0);
        }

        for (int i = 0; i < Math.min(14, allScores.size()); i++) {
            Character staff = allScores.get(i).staff;
            chips.put(staff, chips.get(staff) + 1);
        }

        for (Character staff : staffList) {
            System.out.println(staff + " " + chips.get(staff));
        }
    }

    static class ScoreInfo {
        Character staff;
        double score;

        public ScoreInfo(Character staff, double score) {
            this.staff = staff;
            this.score = score;
        }
    }
}