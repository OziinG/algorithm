import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] array = s.split(" ");
        int[][] points = new int[n][2];
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = Integer.parseInt(array[i]);
            points[i][1] = i;
        }

        Arrays.sort(points, (o1, o2) -> o1[0] - o2[0]);

        int rank = 0;
        for (int i = 0; i < n; i++) {
            if(i > 0 && points[i][0] != points[i-1][0]){
                rank++;
            }
            ranks[i] = rank;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[points[i][1]] = ranks[i];
        }

        for (int i = 0; i < n; i++) {
            bw.write(String.valueOf(result[i]));
            if (i < n - 1) {
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}