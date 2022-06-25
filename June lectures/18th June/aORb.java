import java.util.*;

public class aORb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = 500;
        int B = 1000;

        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Let's solve A first:

        int aScore1 = A - X * 2;
        int bScore1 = B - (X + Y) * 4;

        int totalScore1 = aScore1 + bScore1;

        // Let's solve B first:

        int aScore2 = A - (X + Y) * 2;
        int bScore2 = B - Y * 4;

        int totalScore2 = aScore2 + bScore2;

        if (totalScore1 > totalScore2) {
            System.out.println(totalScore1);
        } else {
            System.out.println(totalScore2);
        }

    }
}