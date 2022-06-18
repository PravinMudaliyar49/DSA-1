public class introToNestedLoops {
    public static void main(String[] args) {
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");
        int n = 5;
        int m = 6;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ==> ");

            for (int j = 1; j <= m; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
