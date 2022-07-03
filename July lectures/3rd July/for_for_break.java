import java.util.*;

public class for_for_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        // for (int i = 1; i <= n3; i++) {
        // if (i <= n1) {
        // System.out.print(i + " ==> ");

        // for (int j = 1; j <= n2; j++) {
        // System.out.print(j + " ");

        // if(i == n3 && j == n4) {
        // break;
        // }
        // }

        // System.out.println();
        // }
        // }

        // String information = "Loop ko chalne do";
        boolean flag = true;

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ==> ");

            for (int j = 1; j <= n2; j++) {
                System.out.print(j + " ");

                if (i == n3 && j == n4) {
                    // information = "Loop ko thod do";
                    flag = false;
                    break;
                }
            }

            // if (information.equals("Loop ko thod do")) {
            //     break;
            // }

            if(flag == false) {
                break;
            }

            System.out.println();
        }

    }
}