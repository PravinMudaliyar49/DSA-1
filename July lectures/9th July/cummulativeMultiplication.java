import java.util.*;

public class cummulativeMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul = 1;

        for (int i = 1; i <= num; i++) {
            int n = sc.nextInt();
            mul *= n;
        }

        System.out.println(mul);

        sc.close();
    }
}