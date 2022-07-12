public class spanOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, -3, -2};

        int greatest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }

            if(arr[i] > greatest) {
                greatest = arr[i];
            }
        }

        System.out.println(greatest - smallest);
    }
}
