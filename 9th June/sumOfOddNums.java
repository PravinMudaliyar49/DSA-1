public class sumOfOddNums {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 100;

        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}