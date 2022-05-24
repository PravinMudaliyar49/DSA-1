import java.util.*;

public class licenceProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        String location = sc.next();

        if (age < 18) {
            if (name.equals("Rohan")) {
                System.out.println("Take licence");
            } else {
                System.out.println("No licence");
            }
        } else if (age == 18) {
            if (location.equals("Mumbai")) {
                System.out.println("Take licence");
            } else {
                System.out.println("After 2 months");
            }
        } else {
            if (name.equals("Kunal")) {
                System.out.println("No licence");
            } else {
                System.out.println("Take licence");
            }
        }
    }
}