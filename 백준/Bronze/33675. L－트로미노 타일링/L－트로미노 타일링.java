import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            if (N%2 != 0) {
                System.out.println(0);
                continue;
            }
            N = N/2;
            long ans = 1;
            while(N-- >0) {
                ans*=2;
            }
            System.out.println(ans);
        }
    }
}