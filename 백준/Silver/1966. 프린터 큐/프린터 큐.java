import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                queue.add(new int[]{priority, i});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int currentPriority = current[0];
                int currentIndex = current[1];

                boolean hasHigherPriority = false;
                for (int[] doc : queue) {
                    if (doc[0] > currentPriority) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    queue.add(current);
                } else {
                    count++;
                    if (currentIndex == M) {
                        break;
                    }
                }
            }

            System.out.println(count);
        }

    }
}