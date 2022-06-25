public class sumOfDigits {
    public static void main(String[] args) {
        int num = 656;
        int sum = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            int newSum = sum + lastDigit;

            sum = newSum;

            num = num / 10;
        }

        System.out.println(sum);
    }
}
