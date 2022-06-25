import java.util.*;

public class ageCalc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");

        int age = sc.nextInt();

        System.out.println("Enter your name:");

        String name = sc.next();

        System.out.println("Enter the year in which you want to see your age");

        int year = sc.nextInt();

        int difference = year - 2022;

        int futureAge = age + difference;

        System.out.println("Hey, " + name + " your age will be " + futureAge + " in " + year + ".");

    }
}
