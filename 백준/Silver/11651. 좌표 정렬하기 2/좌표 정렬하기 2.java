import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<int[]> points = new ArrayList<>();
        for(int i =0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new int[]{x, y});
        }
        points.sort((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            else return Integer.compare(a[0], b[0]);
        });
        for(int i = 0; i < n; i++){
            int[] point = points.get(i);
            System.out.println(point[0] + " " + point[1]);
        }
    }
}