public class internalStorage {
    public static void main(String[] args) {
        // I activity:
        // int x = 10;
        // int y = x;
        // y++;

        // System.out.println(x);
        // System.out.println(y);

        // II activity

        // int[] arr = {10, 20, 30};
        // int[] temp = arr;

        // temp[2] = 100;

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();

        // for(int i = 0; i < temp.length; i++) {
        //     System.out.print(temp[i] + " ");
        // }



        // DEEP COPY OF ARRAYS:

        int[] arr = {10, 20, 30};

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        temp[2] = 100;

        for(int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}