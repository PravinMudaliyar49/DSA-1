import java.util.*;

// package 6th June;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the table's number you want to see:");
        int n = sc.nextInt();

        System.out.println("Enter the limit:");
        int m = sc.nextInt();

        System.out.println("Enter the number you want to skip");
        int z = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            if (i == z) {
                continue;
            }

            int mul = n * i;
            System.out.println(n + " * " + i + " = " + mul);
        }

        for (int i = n; i <= n * m; i = i + n) {
            if (i == z) {
                continue;
            }

            // int mul = n * i;
            // System.out.println(n + " * " + i + " = " + mul);
            System.out.println(i);
        }
    }
}
