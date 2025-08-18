import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            Deque<Character> pw = new ArrayDeque<>();
            Deque<Character> remain = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            String L = sc.next();
            for (int i = 0; i < L.length(); i++) {
                char c = L.charAt(i);
                if (c == '-') {
                    if (!pw.isEmpty()) pw.pollLast();
                } else if (c == '>') {
                    if (!remain.isEmpty()) pw.addLast(remain.pollLast());
                } else if (c == '<') {
                    if (!pw.isEmpty()) remain.addLast(pw.pollLast());
                } else {
                    pw.addLast(c);
                }
            }
            while (!pw.isEmpty()) {
                sb.append(pw.pollFirst());
            }
            while (!remain.isEmpty()) {
                sb.append(remain.pollLast());
            }
            System.out.println(sb);
        }
    }
}