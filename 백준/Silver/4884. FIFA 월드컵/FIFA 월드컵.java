import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Main {
    static long addSum(long team) {
        team--;
        return team * (team + 1) / 2;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            long G = Long.parseLong(arr[0]);
            long T = Long.parseLong(arr[1]);
            long A = Long.parseLong(arr[2]);
            long D = Long.parseLong(arr[3]);
            if (G == -1 && T == -1 && A == -1 && D == -1)
                break;
            long x = addSum(T) * G;
            long torn = A * G + D;
            long y = 0;
            int o = 0;
            while (Math.pow(2, o) < torn) {
                o++;
            }
            y = (long) (Math.pow(2, o) - torn);
            x += torn + y - 1;
            StringBuilder sb = new StringBuilder();
            sb.append(G).append("*").append(A).append("/").append(T).append("+").append(D).append("=").append(x).append("+").append(y);
            System.out.println(sb);
        }
        br.close();
    }
}