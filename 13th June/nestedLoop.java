import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        // System.out.print("Hello ");
        // System.out.print("World ");
        // System.out.print("World ");
        // System.out.println();
        // System.out.print("World ");
        // System.out.print("World ");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ---> ");

            for (int j = 1; j <= m; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }

    }
}