import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int startPosition = 1;
        int endPosition = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == startPosition || j == endPosition) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            // if(i <= num / 2) {
                startPosition++;
                endPosition--;
            // }
            //  else {
            //     startPosition--;
            //     endPosition++;
            // }

            System.out.println();
        }

        sc.close();
    }
}