import java.util.*;

public class infiniteOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }

        // for (; 3 < 4;) {
        //     int num = sc.nextInt();

        //     if (num % 2 == 0) {
        //         System.out.println("The number is even.");
        //     } else {
        //         System.out.println("The number is odd.");
        //     }
        // }

    }
}
