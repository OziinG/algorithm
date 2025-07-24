import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();

        String s = sc.next();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int bCount = 0 , wCount = 0;
            for(int r = i; r< N; r++){
                if(s.charAt(r) == 'B') bCount++;
                else wCount++;

                if(bCount > B)break;

                if (wCount >= W) count = Math.max(count, r - i + 1);
            }

        }

        System.out.println(count);
    }
}