public class cummulativeDivision {
    public static void main(String[] args) {
        int[] arr = takeArrayInput();

        System.out.println("The array's size is " + arr.length);

        int division = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int j = arr[i];
            division = division / j;
        }

        System.out.println(division);
    }

    private static int[] takeArrayInput() {
        return new int[] { 100, 5, 4, 4 };
    }

}