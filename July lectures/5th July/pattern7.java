import java.util.*;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int spaces = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            System.out.println("*\t");
            spaces++;
        }

    }
}
