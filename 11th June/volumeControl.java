import java.util.*;

public class volumeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X > Y) {
            System.out.println(X - Y);
        } else {
            System.out.println(Y - X);
        }

    }
}
