import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        while(!Arrays.equals(arr, new int[]{1, 2, 3, 4, 5})){
            for (int i = 0; i < 4; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    for (int j= 0; j < 5; j++) {
                        System.out.print(arr[j]+ " ");
                    }
                    System.out.println();
                }

            }

        }
    }

}