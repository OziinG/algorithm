import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(sc.next());
        }
        int minChanges = Integer.MAX_VALUE;
        for (int x = 0; x <= n - 8; x++) {
            for (int y = 0; y <= m - 8; y++) {
                int wStart = 0, bStart = 0;
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        char current = board.get(x + i).charAt(y + j);
                        if ((i + j) % 2 == 0) {
                            if (current != 'W') wStart++;
                            if (current != 'B') bStart++;
                        } else {
                            if (current != 'B') wStart++;
                            if (current != 'W') bStart++;
                        }
                    }
                }
                minChanges = Math.min(minChanges, Math.min(wStart, bStart));
            }
        }
        System.out.println(minChanges);
    }
}