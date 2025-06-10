import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
            map[i] = br.readLine().toCharArray();

        int existRowCount = 0;
        for (int i = 0; i < N; i++) {
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                existRowCount++;
            }
        }

        int existColCount = 0;
        for (int i = 0; i < M; i++) {
            boolean exist = false;
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                existColCount++;
            }
        }
        int needRowCount = N - existRowCount;
        int needColCount = M - existColCount;
        System.out.println(Math.max(needRowCount, needColCount));
    }
}

