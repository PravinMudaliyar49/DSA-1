public class optimizedSumOfOdd {
    public static void main(String[] args) {
        int n = 100;

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n; i += 2) {
            count++;
            sum += i;
        }

        System.out.println(sum);
        System.out.println("The loop ran for " + count + " times.");
    }
}
