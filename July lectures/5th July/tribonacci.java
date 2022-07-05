import java.util.*;

public class tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;

        System.out.println(a + "\n" + b + "\n" + c);

        for (int i = 4; i <= num; i++) {
            int d = a + b + c;
            System.out.println(d);
            
            a = b;
            b = c;
            c = d;
        }

    }
}
