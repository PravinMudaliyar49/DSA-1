public class greatestAmongst6 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 6;
        int n4 = 25;
        int n5 = 30;
        int n6 = 200;

        int ans = n1;

        if (n2 > ans) {
            ans = n2;
        }

        if (n3 > ans) {
            ans = n3;
        }

        if (n4 > ans) {
            ans = n4;
        }

        if (n5 > ans) {
            ans = n5;
        }

        if (n6 > ans) {
            ans = n6;
        }

        System.out.println(ans);

    }
}
