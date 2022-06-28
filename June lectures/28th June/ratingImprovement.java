import java.util.Scanner;

public class ratingImprovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int Z = X + 200;

        if(Y <= Z && Y >= X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}