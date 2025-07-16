import java.util.Scanner;

class Main {
    static int numPlay(int N) {
        int sum = 0;
        while(N > 0){
            sum += N%10;
            N /= 10;
        }
        if(sum >= 10) sum = numPlay(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == 0) break;
            int sum = numPlay(N);

            System.out.println(sum);
        }
    }
}