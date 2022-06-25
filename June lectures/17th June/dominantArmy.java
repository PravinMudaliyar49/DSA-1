public class dominantArmy {
    public static void main(String[] args) {
        int Na = 100;
        int Nb = 170;
        int Nc = 50;

        if (Nb > Na + Nc || Na > Nb + Nc || Nc > Na + Nb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
