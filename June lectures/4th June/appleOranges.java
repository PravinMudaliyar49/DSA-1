import java.util.*;

public class appleOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x number of ruppes");
        int x = sc.nextInt();

        System.out.println("Enter a number of apples");
        int a = sc.nextInt();

        System.out.println("Enter b number of oranges");
        int b = sc.nextInt();

        if (a + b <= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
