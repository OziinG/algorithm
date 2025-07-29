import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> listen = new HashSet<>();
        Set<String> see = new HashSet<>();
        for (int i = 0; i < N; i++) {
            listen.add(sc.next());
        }
        for (int i = 0; i < M; i++) {
            see.add(sc.next());
        }

        listen.retainAll(see);
        List<String> ans = new ArrayList<>(listen);
        Collections.sort(ans);

        System.out.println(ans.size());
        for (String name : ans) {
            System.out.println(name);
        }
    }
}