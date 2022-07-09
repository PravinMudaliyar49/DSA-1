import java.util.*;

public class smallestSecondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if (n < secondSmallest) {
                secondSmallest = n;
            }
        }

        System.out.println(smallest);
        System.out.println(secondSmallest);

        sc.close();
    }
}
