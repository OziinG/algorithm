import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine(); // Consume the rest of the line
        String message = sc.nextLine();

        int[] keyMap = {
            1, // ' '
            2, 2, 2, // ABC
            3, 3, 3, // DEF
            4, 4, 4, // GHI
            5, 5, 5, // JKL
            6, 6, 6, // MNO
            7, 7, 7, 7, // PQRS
            8, 8, 8, // TUV
            9, 9, 9, 9  // WXYZ
        };
        int[] pressMap = {
            1, // ' '
            1, 2, 3, // ABC
            1, 2, 3, // DEF
            1, 2, 3, // GHI
            1, 2, 3, // JKL
            1, 2, 3, // MNO
            1, 2, 3, 4, // PQRS
            1, 2, 3, // TUV
            1, 2, 3, 4  // WXYZ
        };

        int totalTime = 0;
        int prevKey = -1;

        for (char ch : message.toCharArray()) {
            int index = (ch == ' ') ? 0 : ch - 'A' + 1;
            int currentKey = keyMap[index];
            int presses = pressMap[index];

            totalTime += presses * p;

            if (currentKey == prevKey && currentKey != 1) {
                totalTime += w;
            }

            prevKey = currentKey;
        }

        System.out.println(totalTime);
    }
}