import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        int result = 0;
        int temp = 1;
        char prev = '\0';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.addLast('(');
                temp *= 2;
            } else if (c == '[') {
                stack.addLast('[');
                temp *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peekLast() != '(') {
                    System.out.println(0);
                    return;
                }
                if (prev == '(') result += temp;
                stack.pollLast();
                temp /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peekLast() != '[') {
                    System.out.println(0);
                    return;
                }
                if (prev == '[') result += temp;
                stack.pollLast();
                temp /= 3;
            } else {
                System.out.println(0);
                return;
            }
            prev = c;
        }

        if (!stack.isEmpty()) result = 0;
        System.out.println(result);
    }
}