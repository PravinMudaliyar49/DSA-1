import java.util.*;

public class greatestAndSecondGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++) {
            int input = sc.nextInt();

            if(input > largest) {
                secondLargest = largest;
                largest = input;
            } else if(input > secondLargest) {
                secondLargest = input;
            }

        }

        System.out.println(largest);
        System.out.println(secondLargest);

        sc.close();
    }
}
