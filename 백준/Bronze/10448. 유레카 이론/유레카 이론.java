import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] triArr = new int[44];
        for (int i = 1; i < 44; i++) {
            triArr[i] = i * (i + 1) / 2;
        }
        while (n-- > 0) {
            int target = Integer.parseInt(br.readLine());
            boolean found = false;
            outer:
            for (int i = 1; i < 44; i++) {
                for (int j = 1; j < 44; j++) {
                    for (int k = 1; k < 44; k++) {
                        if (triArr[i] + triArr[j] + triArr[k] == target) {
                            found = true;
                            break outer;
                        }
                    }
                }
            }
            bw.write(found ? "1\n" : "0\n");
        }
        bw.flush();
    }
}