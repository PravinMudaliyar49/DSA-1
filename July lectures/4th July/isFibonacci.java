import java.util.*;

public class isFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        boolean flag = false;

        for (int i = 1; i <= num - 2; i++) {

            int c = a + b;

            if(c == num) {
                flag = true;
                System.out.println("YES");
                break;
            }

            a = b;
            b = c;
        }

        if(flag == false) {
            System.out.println("NO");
        }

    }
}
