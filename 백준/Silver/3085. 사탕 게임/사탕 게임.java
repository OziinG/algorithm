import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void swapCandy(char[][] arr, int x1, int y1, int x2, int y2) {
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    static int maxRow(char[][] arr) {
        int n = arr.length;
        int max = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == arr[i][j - 1]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    static int maxColumn(char[][] arr) {
        int n = arr.length;
        int max = 1;
        for (int j = 0; j < n; j++) {
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i][j] == arr[i - 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] bomboni = new char[N][N];
        for (int i = 0; i < N; i++)
            bomboni[i] = sc.next().toCharArray();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N && bomboni[i][j] != bomboni[i][j + 1]) {
                    swapCandy(bomboni, i, j, i, j + 1);
                    ans = Math.max(ans, Math.max(maxColumn(bomboni), maxRow(bomboni)));
                    swapCandy(bomboni, i, j, i, j + 1);
                }
                if (i + 1 < N && bomboni[i][j] != bomboni[i + 1][j]) {
                    swapCandy(bomboni, i, j, i + 1, j);
                    ans = Math.max(ans, Math.max(maxColumn(bomboni), maxRow(bomboni)));
                    swapCandy(bomboni, i, j, i + 1, j);
                }
            }
        }
        System.out.println(ans);
    }
}