public class introPattern {
    public static void main(String[] args) {
        int num = 4;

        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num - 1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println("*");
        }

    }
}