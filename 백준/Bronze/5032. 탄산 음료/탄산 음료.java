import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int e = Integer.parseInt(arr[0]);
        int f = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int total = e + f;
        int sum = 0;
        while (total >= c) {
            int drink = total / c;
            sum += drink;
            total = total % c + drink;
        }
        System.out.println(sum);
    }
}