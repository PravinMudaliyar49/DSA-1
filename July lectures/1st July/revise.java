// package July lectures.1st July;

public class revise {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        int n3 = 7;
        int n4 = 3;

        for (int i = 1; i <= n3; i++) {
            System.out.print(i + " ==> ");

            for (int j = 1; j <= n2; j++) {
                System.out.print(j + " ");

                if (j == n4) {
                    break;
                }
            }

            System.out.println();
        }

    }
}
