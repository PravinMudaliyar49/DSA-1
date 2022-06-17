public class reverseNumber {
    public static void main(String[] args) {
        int n = 982341; // o/p: 143289.

        int reverse = 0;

        while (n != 0) {
            int lastDig = n % 10;

            reverse = reverse * 10 + lastDig;

            n = n / 10;
        }

        System.out.println(reverse);
    }
}
