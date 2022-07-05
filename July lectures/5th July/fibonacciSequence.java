import java.util.*;

public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a + "\n" + b);
        
        for (int i = 3; i <= num; i++) {
            int c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }

    }
}