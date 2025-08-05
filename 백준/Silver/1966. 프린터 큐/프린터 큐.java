import java.util.*;

class Main
{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                queue.add(new int[]{priority, i});
                priorityQueue.add(priority);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int currentPriority = current[0];
                int currentIndex = current[1];

                if (currentPriority == priorityQueue.peek()) {
                    priorityQueue.poll();
                    count++;
                    if (currentIndex == M) {
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }

            System.out.println(count);
        }

    }
}