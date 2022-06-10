import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int temp1 = num;
        int temp2 = num;

        int digitsCount = 0;

        while (temp2 != 0) {
            digitsCount++;
            temp2 /= 10;
        }

        int sum = 0;

        while (temp1 != 0) {
            int lastDig = temp1 % 10;

            // int cube = lastDig * lastDig * lastDig;

            // sum = sum + cube;

            int xyz = 1;

            for (int i = 1; i <= digitsCount; i++) {
                xyz = xyz * lastDig;
            }

            sum = sum + xyz;

            temp1 /= 10;
        }

        if (sum == num) {
            System.out.println("It's an armstrong number.");
        } else {
            System.out.println("It's not an armstrong number.");
        }
    }
}