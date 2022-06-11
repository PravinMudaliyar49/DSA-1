import java.util.*;

public class aORb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 500;
        int b = 1000;

        System.out.println("Enter num of x min:");
        int x = sc.nextInt();

        System.out.println("Enter num of y min:");
        int y = sc.nextInt();

        int i = a - 2 * x;
        int j = b - 4 * (y + x);
        int c = i + j;

        int m = b - 4 * y;
        int n = a - 2 * (x + y);
        int d = m + n;
        if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}