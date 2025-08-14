import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            boolean ok = true;

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') { ok = false; break; }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') { ok = false; break; }
                    stack.pop();
                }
            }

            System.out.println(ok && stack.isEmpty() ? "yes" : "no");
        }
    }
}