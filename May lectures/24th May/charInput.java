import java.util.*;

public class charInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // long l = sc.nextLong();
        // double d = sc.nextDouble();

        char ch = sc.next().charAt(0);

        System.out.println("The char's input received is " + ch);
    }
}