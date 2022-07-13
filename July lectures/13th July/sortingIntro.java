import java.util.*;

public class sortingIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Before sorting --> ");

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        System.out.print("After sorting --> ");

        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}