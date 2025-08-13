import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            boolean head = true;
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arrayStr = br.readLine();
            Deque<Integer> deq = new ArrayDeque<>();
            if (n > 0) {
                arrayStr = arrayStr.substring(1, arrayStr.length() - 1); 
                String[] elements = arrayStr.split(",");

                for (String element : elements) {
                    deq.add(Integer.parseInt(element.trim()));
                }
            }
            try {
                for (int i = 0; i < p.length(); i++) {
                    if(p.charAt(i) == 'R') head = !head;
                    if(p.charAt(i) == 'D'){
                        if(head) deq.removeFirst();
                        else deq.removeLast();
                    }
                }
            } catch (Exception e) {
                bw.append("error\n");
                continue;
            }
            bw.append('[');
            Iterator<Integer> it;
            if(head) {
                it = deq.iterator();
            } else {
                it = deq.descendingIterator();
            }
            while (it.hasNext()) {
                bw.append(String.valueOf(it.next()));
                if (it.hasNext()) bw.append(',');
            }
            bw.append(']');
            bw.append('\n');
        }
        bw.flush();
    }
}