import java.util.*;

public class chefGivesParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n number of friends");
        int N = sc.nextInt();

        System.out.println("Enter x number of rupees");
        int X = sc.nextInt();

        System.out.println("Enter k number of total rupees");
        int K = sc.nextInt();

        if (N * X <= K) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}