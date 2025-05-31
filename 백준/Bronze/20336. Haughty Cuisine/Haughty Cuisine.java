import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 메뉴 개수 입력 받기
        List<List<String>> menus = new ArrayList<>();

        // 메뉴 리스트 저장
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            int d = Integer.parseInt(parts[0]); // 메뉴에 포함된 음식 개수
            List<String> menu = new ArrayList<>(Arrays.asList(parts).subList(1, d + 1));
            menus.add(menu);
        }

        // 랜덤한 세트 메뉴 선택 (여러 정답이 가능하므로 첫 번째 메뉴 선택)
        List<String> chosenMenu = menus.get(0);

        // 출력
        bw.write(chosenMenu.size() + "\n"); // 음식 개수 출력
        for (String dish : chosenMenu) {
            bw.write(dish + "\n"); // 각 음식 출력
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
