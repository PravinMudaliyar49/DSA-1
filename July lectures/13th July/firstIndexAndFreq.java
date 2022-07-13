import java.util.*;

public class firstIndexAndFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int firstIndex = -1;
        int frequency = 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] == target) {
                if(firstIndex == -1) {
                    firstIndex = i;
                }

                frequency++;
            }
        }

        System.out.println(firstIndex);
        System.out.println(frequency);

        sc.close();
    }
}
