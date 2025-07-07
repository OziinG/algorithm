import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> bookCounts = new TreeMap<>();
        while(n-- > 0) {
            String book = sc.next();
            bookCounts.put(book, bookCounts.getOrDefault(book, 0) + 1);
        }
        int max = 0;
        String answer = "";
        for (String book : bookCounts.keySet()) {
            int count = bookCounts.get(book);
            if (count > max) {
                max = count;
                answer = book;
            }
        }
        System.out.println(answer);
    }
}