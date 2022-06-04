import java.util.*;

public class sixFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of a double room");
        int x = sc.nextInt();

        System.out.println("Enter cost of a triple room");
        int y = sc.nextInt();
        
        if (x * 3 < y * 2) {
            System.out.println(x * 3);
        } else {
            System.out.println(y * 2);
        }
    }
}
