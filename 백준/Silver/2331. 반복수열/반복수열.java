import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int A = sc.nextInt();
        int P = sc.nextInt();
        int idx = 0;

        while(true){
            if (map.containsKey(A)){
                System.out.println(map.get(A));
                break;
            }else {
                map.put(A, idx);
            }
            A = calcPSum(A,P);
            idx++;
        }

    }

    private static int calcPSum(int a, int p) {
        int sum = 0;
        while(a > 0) {
            sum += (int) Math.pow((a%10),p);
            a /= 10;
        }
        return sum;
    }
}