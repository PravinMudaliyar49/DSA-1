import java.util.Scanner;

// package 23rd May;

public class greatestAmonst3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("num1 is the greatest.");
            } else {
                System.out.println("num3 is the greatest.");
            }
        } else if (n2 > n3) {
            System.out.println("num2 is the greatest.");
        } else {
            System.out.println("num3 is the greatest.");
        }

    }
}
