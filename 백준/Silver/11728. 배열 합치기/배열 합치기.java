import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] aArr = new int[A];
        int[] bArr = new int[B];
        for (int i = 0; i < A; i++) {
            aArr[i] = sc.nextInt();
        }
        for (int i = 0; i < B; i++) {
            bArr[i] = sc.nextInt();
        }

        int[] totalArr = new int[A+B];
        int a = 0, b = 0;
        for (int i = 0; i < A+B; i++) {
            if (a >= A) {
                totalArr[i] = bArr[b++];
            } else if (b >= B) {
                totalArr[i] = aArr[a++];
            } else if (aArr[a] <= bArr[b]) {
                totalArr[i] = aArr[a++];
            } else {
                totalArr[i] = bArr[b++];
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < A+B; i++) {
            bw.write(totalArr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}