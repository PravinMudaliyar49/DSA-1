import java.util.*;

public class relationBetweenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("Number 1 is greater than number2");
            } else {
                System.out.println("Number 1 is smaller than number2");
            }
            
        } else {
            System.out.println("Number 1 is equal to number 2.");
        }

    }
}