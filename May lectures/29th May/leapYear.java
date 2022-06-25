import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();

        // SOLUTION 1:

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // SOLUTION 2:

        if (year % 100 == 0) {
            System.out.println("Its not a leap year");
        } else if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its a leap year");
        }

    }
}