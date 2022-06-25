import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reversedNum = 0;

        while (num != 0) {
            int lastDig = num % 10;

            reversedNum = reversedNum * 10 + lastDig;

            num = num / 10;
        }

        System.out.println(reversedNum);

    }
}
