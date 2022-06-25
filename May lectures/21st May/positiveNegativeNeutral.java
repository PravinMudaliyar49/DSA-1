import java.util.Scanner;

public class positiveNegativeNeutral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Neutral.");
        } else if (num < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Positive.");
        }

        if (num % 2 == 0) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

    }
}
