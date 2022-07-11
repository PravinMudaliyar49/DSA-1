import java.util.*;

public class arrayWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Element at " + (i + 1) + " position is " + arr[i]);
        }

        sc.close();
    }
}
