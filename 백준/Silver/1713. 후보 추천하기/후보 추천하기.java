import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] students = new int[101];
        ArrayList<Integer> list = new ArrayList<>();
        while(M-- > 0) {
            int recom = sc.nextInt();
            if(list.contains(recom)){
             students[recom]++;
            }
            else if(list.size() < N ) {
                list.add(recom);
                students[recom]++;
            }
            else {
                list = compareDelete(list, students);
                list.add(recom);
                students[recom]++;
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i : list){
            sb.append(i + " ");
        }
        System.out.println(sb);
    }

    private static ArrayList<Integer> compareDelete(ArrayList<Integer> list, int[] count) {
        int minCount = Integer.MAX_VALUE;
        int removeIndex = 0;

        for(int i = 0; i < list.size(); i++){
            if(count[list.get(i)] < minCount) {
                minCount = count[list.get(i)];
                removeIndex = i;
            }
        }

        count[list.get(removeIndex)] = 0;
        list.remove(removeIndex);

        return list;
    }
}