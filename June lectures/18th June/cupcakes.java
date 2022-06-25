public class cupcakes {
    public static void main(String[] args) {
        int N = 8; // o/p ==> 6.

        int A = N / 2 + 1;

        int leftCupCakes = N - A;

        int ans = N - leftCupCakes;

        System.out.println(ans);
    }
}
