public class reverseAppend {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};
        int[] a2 = {40, 50, 60, 70, 80};

        // 10 20 30 80 70 60 50 40.

        int[] a3 = new int[a1.length + a2.length];

        int index = 0;

        for(int i = 0; i < a1.length; i++) {
            // System.out.print(a1[i] + " ");

            a3[index] = a1[i];
            index++;
        }
        
        for(int i = a2.length - 1; i >= 0; i--) {
            // System.out.print(a2[i] + " ");
            
            a3[index] = a2[i];
            index++;
        }

        for(int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }

    }
}
