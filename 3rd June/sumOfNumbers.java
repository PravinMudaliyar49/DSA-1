public class sumOfNumbers {
    public static void main(String[] args) {
        int num = 6;

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int newSum = sum + i;
            sum = newSum;
        }
        
        System.out.println(sum);
    }
}
