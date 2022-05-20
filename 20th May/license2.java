import java.util.*;

public class license2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Take license.");
        } else if (age == 18) {
            System.out.println("License after 2 months.");
        } else {
            System.out.println("No license.");
        }

    }
}
