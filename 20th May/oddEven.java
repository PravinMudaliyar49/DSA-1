import java.util.*;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Jo number user se mila hai, agar voh 2 se divide hone k baad... 0 remainder
        // chodta hai.... Toh voh even hai.

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
