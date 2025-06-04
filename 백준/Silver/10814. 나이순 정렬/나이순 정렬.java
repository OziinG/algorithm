import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        class User {
            int age;
            String name;
            int order;
            User(int age, String name, int order) {
                this.age = age;
                this.name = name;
                this.order = order;
            }
        }
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            userList.add(new User(age, name, i));
        }
        userList.sort((u1, u2) -> {
            if (u1.age != u2.age) return u1.age - u2.age;
            return u1.order - u2.order;
        });
        StringBuilder sb = new StringBuilder();
        for (User u : userList) {
            sb.append(u.age).append(" ").append(u.name).append("\n");
        }
        System.out.print(sb);
    }
}

