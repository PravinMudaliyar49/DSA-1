import java.util.*;

public class packagingCupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cupcakes");
        int n = sc.nextInt();
        int maxCupCake = 0;

        for (int a = 1; a <= n; a++) {
            int c = n % a;
            if (c > maxCupCake) {
                maxCupCake = c;
            }
        }

        System.out.println(n - maxCupCake);
    }
}
