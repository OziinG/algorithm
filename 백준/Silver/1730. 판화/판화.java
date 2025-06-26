import java.io.*;

public class Main {
    static int x = 0, y = 0;

    public static void drawHorizontalLine(char[][] map, int x, int y) {
        if (map[x][y] == 0 || map[x][y] == 46) { 
            map[x][y] = 45; 
        } else if (map[x][y] == 124) {
            map[x][y] = 43; 
        }
    }
    public static void drawVerticalLine(char[][] map, int x, int y) {
        if (map[x][y] == 0 || map[x][y] == 46) {
            map[x][y] = 124;
        } else if (map[x][y] == 45) {
            map[x][y] = 43;
        }
    }

    public static void mapMove(char[][] map, char c) {
        switch (c) {
            case 'U':
                if (x > 0) {
                    drawVerticalLine(map, x, y);
                    x--;
                    drawVerticalLine(map, x, y);
                }
                break;
            case 'D':
                if (x < map.length - 1) {
                    drawVerticalLine(map, x, y);
                    x++;
                    drawVerticalLine(map, x, y);
                }
                break;
            case 'L':
                if (y > 0) {
                    drawHorizontalLine(map, x, y);
                    y--;
                    drawHorizontalLine(map, x, y);
                }
                break;
            case 'R':
                if (y < map[0].length - 1) {
                    drawHorizontalLine(map, x, y);
                    y++;
                    drawHorizontalLine(map, x, y);
                }
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = 46;
            }
        }
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            mapMove(map, s.charAt(i));
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}