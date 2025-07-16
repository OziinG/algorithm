import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String N = sc.next();
            if(N.equals("#")) break;
            int count = 0;
            for (int i = 0; i < N.length()-1; i++) {
                if(N.charAt(i) == '1') count ++;
            }
            if(count%2 == 0) {
                N = N.replace("e", "0");
                N = N.replace("o","1");
            } else {
                N = N.replace("e", "1");
                N = N.replace("o","0");
            }
            System.out.println(N);
        }
    }
}