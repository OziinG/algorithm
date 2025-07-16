import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] onions = {1, 1};
        while (N-- > 0) {
            onions[0] += A;
            onions[1] += B;

            if(onions[0] == onions[1]) {
                onions[1] -= 1;
            } else if(onions[1] > onions[0]) {
                int temp = onions[0];
                onions[0] = onions[1];
                onions[1] = temp;
            }
        }
        System.out.println(onions[0] + " " + onions[1]);
    }
}