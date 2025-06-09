import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i =0; i < N; i++){
            int hamDist = 0;
            String s = scanner.next();
            String t = scanner.next();
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) != t.charAt(j)){
                    hamDist++;
                }
            }
            System.out.println("Hamming distance is " + hamDist+ ".");
        }
    }
}