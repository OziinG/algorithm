import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] alc = new int[N + 1];
        int[] accAlc = new int[N + 1];
        int count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            alc[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 1; i <= N; i++) {
            if(i > L) {
                accAlc[i] = alc[i] + accAlc[i - 1] - alc[i-L];
            } else {
                accAlc[i] = alc[i] + accAlc[i - 1];
            }
            if (accAlc[i] >= 129 && accAlc[i] <= 138) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}