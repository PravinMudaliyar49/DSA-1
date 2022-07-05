import java.util.*;

public class isFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        // boolean yesPrinted = false;

        int flag = 1;

        for (int i = 3; i <= num; i++) {
            int c = a + b;

            if (c == num) {
                System.out.println("YES");
                flag = 0;
                // yesPrinted = true;
                break;
            }

            a = b;
            b = c;
        }

        // if(yesPrinted == false) {
        //     System.out.println("NO");
        // }
        
        if(flag == 1) {
            System.out.println("NO");
        }

    }
}
