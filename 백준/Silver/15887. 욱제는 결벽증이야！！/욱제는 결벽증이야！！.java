import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1]; // 1-indexed

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<String> operations = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            // i번째 위치에 i가 있는지 확인
            if (arr[i] == i) continue;

            // i값이 어디에 있는지 찾기
            int pos = -1;
            for (int j = i + 1; j <= N; j++) {
                if (arr[j] == i) {
                    pos = j;
                    break;
                }
            }

            if (pos == -1) continue;

            // i값을 i번째 위치로 가져오기
            if (pos == i + 1) {
                // 바로 옆에 있으면 한 번에 뒤집기
                reverse(arr, i, pos);
                operations.add(i + " " + pos);
            } else {
                // 먼저 i+1 위치로 가져온 후, i 위치로 가져오기
                reverse(arr, i + 1, pos);
                operations.add((i + 1) + " " + pos);
                reverse(arr, i, i + 1);
                operations.add(i + " " + (i + 1));
            }
        }

        System.out.println(operations.size());
        for (String op : operations) {
            System.out.println(op);
        }
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}