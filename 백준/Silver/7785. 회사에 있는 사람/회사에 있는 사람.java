import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> companyWorkers = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String status = sc.next();

            if (status.equals("enter")) {
                companyWorkers.add(name);
            } else if (status.equals("leave")) {
                companyWorkers.remove(name);
            }
        }
        String[] remainingWorkers = companyWorkers.toArray(new String[0]);
        Arrays.sort(remainingWorkers, Collections.reverseOrder());

        for (String workerName : remainingWorkers) {
            System.out.println(workerName);
        }
    }
}