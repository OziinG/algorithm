import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dist = new int[N];
        int total = 0;
        
        for (int i = 0; i < N; i++) {
            dist[i] = sc.nextInt();
            total += dist[i];
        }
        
        int left = 0, right = 0;
        int currentDist = 0;
        int maxDist = 0;
        
        for (int i = 0; i < N; i++) {
            while (currentDist * 2 < total) {
                currentDist += dist[right];
                right = (right + 1) % N;
                if (right == left) break;
            }
            
            int clockwise = currentDist;
            int counterclockwise = total - currentDist;
            maxDist = Math.max(maxDist, Math.min(clockwise, counterclockwise));
            
            currentDist -= dist[left];
            left = (left + 1) % N;
        }
        
        System.out.println(maxDist);
    }
}