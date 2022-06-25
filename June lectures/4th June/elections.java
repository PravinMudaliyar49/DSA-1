import java.util.*;

public class elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of votes A recived");
        int a = sc.nextInt();

        System.out.println("Enter the no. of votes B recived");
        int b = sc.nextInt();
        
        System.out.println("Enter the no. of votes C recived");
        int c = sc.nextInt();

        if (a > 50) {
            System.out.println("A won");
        } else if (b > 50) {
            System.out.println("B won");
        } else if (c > 50) {
            System.out.println("C won");
        } else {
            System.out.println("NOTA");
        }

    }
}
