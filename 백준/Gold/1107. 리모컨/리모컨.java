import java.util.Scanner;

class Main {
    static boolean isAllGood(int n, int[] broken) {
        String numStr = String.valueOf(n);
        for (char digit : numStr.toCharArray()) {
            int digitNum = digit - '0';
            for (int brokenButton : broken) {
                if (digitNum == brokenButton) {
                    return false;
                }
            }
        }
        return true;
    }

    static int getDigitCount(int n) {
        return String.valueOf(n).length();
    }

    static int upperLower(int n, int[] broken) {
        int upper = Integer.MAX_VALUE;
        int lower = Integer.MAX_VALUE;

        for (int i = n; i <= 1000000; i++) {
            if (isAllGood(i, broken)) {
                upper = Math.abs(i - n) + getDigitCount(i);
                break;
            }
        }

        for (int i = n; i >= 0; i--) {
            if (isAllGood(i, broken)) {
                lower = Math.abs(i - n) + getDigitCount(i);
                break;
            }
        }

        return Math.min(upper, lower);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] broken = new int[M];
        for (int i = 0; i < M; i++) {
            broken[i] = sc.nextInt();
        }

        int count100 = Math.abs(100 - N);
        
        int countNumpad = Integer.MAX_VALUE;
        
        if (M == 10) {
            countNumpad = Integer.MAX_VALUE;
        } else if (isAllGood(N, broken)) {
            countNumpad = getDigitCount(N);
        } else {
            countNumpad = upperLower(N, broken);
        }
        
        int result = Math.min(count100, countNumpad);
        System.out.println(result);
    }
}