import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> weight = new ArrayList<>();
        List<Integer> height = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            weight.add(sc.nextInt());
            height.add(sc.nextInt());
        }
        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(i != j) {
                    if(weight.get(i) < weight.get(j) && height.get(i) < height.get(j)) {
                        rank++;
                    }
                }
            }
            System.out.print(rank + " ");
        }
    }
}