public class pattern7 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

    }
}
