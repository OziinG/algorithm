import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int[] ans = new int[N];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            idx = (idx + K - 1) % people.size();
            ans[i] = people.remove(idx);
        }

        System.out.print("<");
        for (int i = 0; i < N; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(ans[i]);
        }
        System.out.print(">");

    }
}