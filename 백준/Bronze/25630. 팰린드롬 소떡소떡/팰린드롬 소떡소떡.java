import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        int count =0;
        for(int i =0; i < st.length()/2; i++){
            if(st.charAt(i) != st.charAt(st.length() - 1 - i)){
                count++;
            }
        }
        System.out.println(count);
    }
}