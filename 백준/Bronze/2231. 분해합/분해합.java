import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // M을 입력받음
        int M = scanner.nextInt();
        
        // 생성자 찾기
        int result = 0;
        for (int i = 1; i < M; i++) {
            if (getDecompositionSum(i) == M) {
                result = i;
                break;
            }
        }
        
        // 생성자가 없으면 0을 출력
        System.out.println(result);
        
        scanner.close();
    }
    
    // 분해합을 구하는 함수
    public static int getDecompositionSum(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;  // 각 자리수를 더함
            num /= 10;        // 다음 자리수로 이동
        }
        return sum;
    }
}
