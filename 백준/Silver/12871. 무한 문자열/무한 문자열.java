import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int sLen = s.length();
        int tLen = t.length();
        int times =lcm(sLen, tLen);
        s = s.repeat(times/sLen);
        t = t.repeat(times/tLen);
        if(s.equals(t)) System.out.println(1);
        else System.out.println(0);

    }
    
    static int gdc(int a, int b) { //최대 공약수
        if(a<b) // 유클리드 호제법 조건
        {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0) { // 유클리드 호제법
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b) { //최소 공배수
        return a*b / gdc(a,b);
    }
}