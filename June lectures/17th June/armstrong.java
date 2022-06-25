import java.util.Scanner;

public class armstrong {
    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Not an armstrong.
        int temp1 = n;
        int temp2 = n;

        int digitsCount = 0;

        while (temp2 != 0) {
            digitsCount++;
            temp2 = temp2 / 10;
        }

        int sum = 0;

        while (temp1 != 0) {
            int lastDig = temp1 % 10;

            // int cube = lastDig * lastDig * lastDig;
            // sum = sum + cube;

            int z = 1;

            for (int i = 1; i <= digitsCount; i++) {
                z = z * lastDig;
            }

            sum = sum + z;

            temp1 = temp1 / 10;
        }

        if (sum != n) {
            System.out.println("Not an armstrong.");
        } else {
            System.out.println("Armstrong.");
        }

    }
}
