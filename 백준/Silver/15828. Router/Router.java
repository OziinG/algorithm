import java.util.*;
import java.io.*;

class Main
{

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if(input == -1) break;
            else if (input == 0) {
                que.poll();
            }
            else {
                if(que.size() < N) {
                    que.add(input);
                }
            }
        }

        if(que.isEmpty()) {
            bw.write("empty");
        } else {
            for (int i : que) {
                bw.write(i + " ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}