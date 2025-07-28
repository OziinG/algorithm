import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initial = sc.next();

        LinkedList<Character> text = new LinkedList<>();

        for (char c : initial.toCharArray()) {
            text.add(c);
        }

        int M = sc.nextInt();
        ListIterator<Character> cursor = text.listIterator(text.size());

        while (M-- > 0) {
            char cmd = sc.next().charAt(0);
            switch (cmd) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case 'P':
                    cursor.add(sc.next().charAt(0));
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : text) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}