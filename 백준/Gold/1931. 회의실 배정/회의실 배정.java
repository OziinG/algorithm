import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static class Room {
        int sTime;
        int eTime;

        Room(int sTime, int eTime) {
            this.sTime = sTime;
            this.eTime = eTime;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] rooms = new Room[n];
        for (int i = 0; i < n; i++) {
            rooms[i] = new Room(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(rooms, (o1, o2) -> {
            if (o1.eTime == o2.eTime) return o1.sTime - o2.sTime;
            return o1.eTime - o2.eTime;
        });

        int count = 0;
        int eTimes = 0;
        for (int i = 0; i < n; i++) {
            if(rooms[i].sTime >= eTimes) {
                count++;
                eTimes = rooms[i].eTime;
            }
        }
        System.out.println(count);
    }
}