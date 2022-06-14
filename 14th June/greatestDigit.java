public class greatestDigit {
    public static void main(String[] args) {
        int num = 69784;

        int ans = 0;

        while (num != 0) {
            int lastDigit = num % 10;

            if (lastDigit > ans) {
                ans = lastDigit;
            }

            num = num / 10;
        }

        System.out.println(ans);
    }
}
