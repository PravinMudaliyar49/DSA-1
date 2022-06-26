import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {
            int countOfFactors = 0;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                int rem = i % j;
                if (rem == 0) {
                    countOfFactors++;
                    break;
                }
            }

            if (countOfFactors == 0) {
                System.out.println(i);
            }
        }

    }
}
