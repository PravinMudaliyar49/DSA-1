import java.util.Scanner;

// package 23rd May;

public class greatestAmongst2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = 0;

        if (n1 > n2) {
            ans = n1;
        } else {
            ans = n2;
        }

        System.out.println(ans);
    }
}
