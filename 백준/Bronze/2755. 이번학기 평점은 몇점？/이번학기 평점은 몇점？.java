import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> gradeToScore = new HashMap<>();
        gradeToScore.put("A+", 4.3); gradeToScore.put("A0", 4.0); gradeToScore.put("A-", 3.7);
        gradeToScore.put("B+", 3.3); gradeToScore.put("B0", 3.0); gradeToScore.put("B-", 2.7);
        gradeToScore.put("C+", 2.3); gradeToScore.put("C0", 2.0); gradeToScore.put("C-", 1.7);
        gradeToScore.put("D+", 1.3); gradeToScore.put("D0", 1.0); gradeToScore.put("D-", 0.7);
        gradeToScore.put("F", 0.0);

        int n = Integer.parseInt(scanner.nextLine());

        double totalGradePoints = 0.0;
        double totalCredits = 0.0;

        while(n-- >0) {
            String[] input = scanner.nextLine().split(" ");
            String subjectName = input[0];
            double credits = Double.parseDouble(input[1]);
            String grade = input[2];

            double score = gradeToScore.get(grade);

            totalCredits += credits;
            totalGradePoints += credits * score;
        }
        double gpa = totalGradePoints / totalCredits;

        System.out.printf("%.2f%n", gpa);

        scanner.close();
    }
}