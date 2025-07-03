import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String words = br.readLine();

        long sum = 0;
        StringBuilder numBuilder = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            if (Character.isDigit(c)) {
                numBuilder.append(c);
            } else if (numBuilder.length() > 0) {
                sum += Long.parseLong(numBuilder.toString());
                numBuilder.setLength(0);
            }
        }

        // 문자열 끝에 숫자가 있는 경우 처리
        if (numBuilder.length() > 0) {
            sum += Long.parseLong(numBuilder.toString());
        }

        System.out.println(sum);
    }
}