import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] wheel = new char[n];
        Arrays.fill(wheel, '?');
        boolean[] used = new boolean[26];
        int pos = 0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            pos = ((pos - s) % n + n) % n;            if (wheel[pos] == '?') {
                if (used[c - 'A']) {
                    System.out.println("!");
                    return;
                }
                wheel[pos] = c;
                used[c - 'A'] = true;
            } else if (wheel[pos] != c) {
                System.out.println("!");
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(wheel[(pos + i) % n]);
        }
        System.out.println(sb);
    }
}