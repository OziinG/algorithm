import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int mod = 20000303;
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = (int)(((long)result * 10 + (n.charAt(i) - '0')) % mod);
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}