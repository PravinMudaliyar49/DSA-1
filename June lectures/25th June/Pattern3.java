public class pattern3 {
    public static void main(String[] args) {
        int n = 5;

        while (n > 0) {
            for (int j = n; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
            n--;
        }

        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}