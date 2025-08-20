import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();

        String word = normalWords(N, s);
        // 1은 카멜 케이스, 2: 스네이크 케이스, 3: 파스칼 케이스

        System.out.println(toCamel(word));
        System.out.println(toSnake(word));
        System.out.println(toPascal(word));

    }

    private static String normalWords(int n, String s) {
        StringBuilder current = new StringBuilder();
        StringBuilder out = new StringBuilder();
        switch (n) {
            case 1:
            case 3:
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (c == '_' || c == ' ') {
                        if (current.length() > 0) {
                            if (out.length() > 0) out.append(' ');
                            out.append(current.toString());
                            current.setLength(0);
                        }
                        continue;
                    }
                    if (Character.isUpperCase(c)) {
                        if (current.length() > 0) {
                            if (out.length() > 0) out.append(' ');
                            out.append(current.toString());
                            current.setLength(0);
                        }
                        current.append(Character.toLowerCase(c));
                    } else {
                        current.append(c);
                    }
                }
                if (current.length() > 0) {
                    if (out.length() > 0) out.append(' ');
                    out.append(current.toString());
                }
                break;
            case 2:
                int start = 0;
                for (int i = 0; i <= s.length(); i++) {
                    if (i == s.length() || s.charAt(i) == '_') {
                        if (i > start) {
                            String w = s.substring(start, i).toLowerCase();
                            if (!w.isEmpty()) {
                                if (out.length() > 0) out.append(' ');
                                out.append(w);
                            }
                        }
                        start = i + 1;
                    }
                }
                break;
        }
        return out.toString();
    }

    private static String toCamel(String normalized) {
        String[] parts = splitNormalized(normalized);
        if (parts.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(parts[0].toLowerCase());
        for (int i = 1; i < parts.length; i++) {
            if (parts[i].isEmpty()) continue;
            sb.append(capitalize(parts[i]));
        }
        return sb.toString();
    }

    private static String toSnake(String normalized) {
        String[] parts = splitNormalized(normalized);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].isEmpty()) continue;
            if (sb.length() > 0) sb.append('_');
            sb.append(parts[i].toLowerCase());
        }
        return sb.toString();
    }

    private static String toPascal(String normalized) {
        String[] parts = splitNormalized(normalized);
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p.isEmpty()) continue;
            sb.append(capitalize(p));
        }
        return sb.toString();
    }

    private static String[] splitNormalized(String normalized) {
        String trimmed = normalized == null ? "" : normalized.trim();
        if (trimmed.isEmpty()) return new String[0];
        return trimmed.split("\\s+");
    }

    private static String capitalize(String s) {
        if (s == null || s.isEmpty()) return "";
        char first = s.charAt(0);
        if (Character.isLetter(first)) {
            return Character.toUpperCase(first) + (s.length() > 1 ? s.substring(1).toLowerCase() : "");
        }
        return s; 
    }
}