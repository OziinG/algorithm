import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nowTime = sc.nextLine();
        String goalTime = sc.nextLine();

        int nowHour = Integer.parseInt(nowTime.substring(0, 2));
        int nowMinute = Integer.parseInt(nowTime.substring(3, 5));
        int nowSecond = Integer.parseInt(nowTime.substring(6, 8));
        int nowTotalSeconds = nowHour * 3600 + nowMinute * 60 + nowSecond;
        int goalHour = Integer.parseInt(goalTime.substring(0, 2));
        int goalMinute = Integer.parseInt(goalTime.substring(3, 5));
        int goalSecond = Integer.parseInt(goalTime.substring(6, 8));
        int goalTotalSeconds = goalHour * 3600 + goalMinute * 60 + goalSecond;
        int resultTime = goalTotalSeconds - nowTotalSeconds;

        if (resultTime <= 0) {
            resultTime += 24 * 3600; // 두 시간이 같거나 goal이 더 이전이면 24시간 더함
        }

        int resultHour = resultTime / 3600;
        int resultMinute = (resultTime % 3600) / 60;
        int resultSecond = resultTime % 60;

        String result = String.format("%02d:%02d:%02d", resultHour, resultMinute, resultSecond);
        System.out.println(result);
    }
}

