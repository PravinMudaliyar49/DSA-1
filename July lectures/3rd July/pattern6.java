public class pattern6 {
    public static void main(String[] args) {
        int n = 5;

        int stars = 1;
        int spaces = n / 2;

        for (int i = 1; i <= n; i++) {
            // System.out.print(spaces + " " + stars);

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

            System.out.println();
        }

    }
}
