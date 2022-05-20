import java.util.*;

public class conditionalSalaryCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int increment = sc.nextInt();
        int year = sc.nextInt();

        if (year > 2022) {
            int difference = year - 2022;
            int incRupees = salary * increment / 100;

            int rupee = difference * incRupees;

            int futureSalary = rupee + salary;

            System.out.println("Your future salary is " + futureSalary + ".");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
