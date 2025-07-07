import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if (n > 9) {
            list.add(n/10);
            list.add(n%10);
        } else {
            list.add(0);
            list.add(n);
        }
        int newNumber = n+1;
        int count = 0;
        while(newNumber != n){
            int sum = list.get(list.size()-1) + list.get(list.size() - 2);
            list.add(sum % 10);
            newNumber = list.get(list.size()-2)*10 + list.get(list.size()-1);
            count ++;
        }
        System.out.println(count);
    }
}