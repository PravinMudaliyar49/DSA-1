public class logicalOperator {
    public static void main(String[] args) {
        // int n1 = 10, n2 = 100, n3 = 5;

        // if (n1 > n2) {
        // if (n1 > n3) {
        // System.out.println(n1);
        // } else {
        // System.out.println(n3);
        // }
        // } else if (n2 > n3) {
        // System.out.println(n2);
        // } else {
        // System.out.println(n3);
        // }

        // if (n1 > n2 && n1 > n3) {
        // System.out.println(n1);
        // } else if (n2 > n3) {
        // System.out.println(n2);
        // } else {
        // System.out.println(n3);
        // }

        String name = "Rohan";
        int age = 17;

        if (age < 18) {
            if (name.equals("Rohan")) {
                System.out.println("Take licence");
            } else {
                System.out.println("No licence");
            }
        } else {
            System.out.println("Take licence");
        }

        if (age > 18 || name.equals("Rohan")) {
            System.out.println("Take licence");
        } else {
            System.out.println("No licence");
        }
    }
}
