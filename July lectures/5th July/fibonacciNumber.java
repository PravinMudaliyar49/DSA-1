import java.util.*;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // int a = 0;
        // int b = 1;
        // int ans = 0;

        // for (int i = 3; i <= num; i++) {
        //     int c = a + b;

        //     a = b;
        //     b = c;
        //     ans = c;
        // }

        // System.out.println(ans);

        int a = 0;
        int b = 1;

        for (int i = 3; i <= num; i++) {
            int c = a + b;

            if(i == num) {
                System.out.println(c);
            }

            a = b;
            b = c;
        }
        
    }
}
