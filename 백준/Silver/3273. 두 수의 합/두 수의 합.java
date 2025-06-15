import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int x = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : arr) {
            int diff = x - num;
            if (set.contains(diff)) {
                count++;
            }
            set.add(num);
        }

        bw.write(String.valueOf(count));
        bw.flush();
    }
}