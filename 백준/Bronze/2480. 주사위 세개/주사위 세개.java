import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[7];
        int n = 3;
        
        int[] dice = new int[n];
        for (int i = 0; i < n; i++) {
            dice[i] = sc.nextInt();
            counts[dice[i]]++;
        }
        
        int maxCount = 0;
        int maxDice = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                maxDice = i;
            }
        }

        
        int reward = 0;
        if (maxCount == 3) {
            reward = 10000 + maxDice * 1000;
        } else if (maxCount == 2) {
            reward = 1000 + maxDice * 100;
        } else {
            int maxValue = Math.max(dice[0], Math.max(dice[1], dice[2]));
            reward = maxValue * 100;
        }

        System.out.println(reward);
        sc.close();
    }
}