public class pattern5 {
    public static void main(String[] args) {
        int n = 5;

        int stars = n;
        int spaces = 0;

        for (int i = 1; i <= n; i++) {
            // System.out.print(spaces + " " + stars);

            for (int j = 1; j <= spaces; j++) {
                System.out.print("_");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            spaces++;
            stars--;

            System.out.println();
        }

    }
}