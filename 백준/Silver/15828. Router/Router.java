import java.util.*;

class Main
{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        while (true) {
            int input = sc.nextInt();
            if(input == -1) break;
            else if (input == 0) que.poll();
            else que.add(input);
        }
        for (int i : que) {
            System.out.print(i + " ");
        }
    }
}