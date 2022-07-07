import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + "\t");
            }

            char ch = 10000;
            System.out.println(ch);

            System.out.println();
        }

        sc.close();
    }
}
