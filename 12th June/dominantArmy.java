import java.util.*;

public class dominantArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num of army:");
        int a = sc.nextInt();

        System.out.println("Enter b num of army:");
        int b = sc.nextInt();

        System.out.println("Enter c num of army:");
        int c = sc.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}