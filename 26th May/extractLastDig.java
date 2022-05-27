import java.util.*;

public class extractLastDig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = n % 100;

        System.out.println(ans);
    }
}