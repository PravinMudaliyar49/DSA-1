public class zPattern{
    public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");


        int age2 = 20;

        System.out.println("Palash's age in 2022 is " + age2 + ".");

        age2 = 21;

        System.out.println("Palash's age in 2023 is " + age2 + ".");


        int x = 15;
        int y = 3;

        int z = x / y;

        int a = x % y;

        System.out.println(z);
        System.out.println(a);


        int age = 20;

        age += 10;     // age = age + 10;

        age -= 10;     // age = age - 10;

        age *= 10;     // age = age * 10;

        age /= 10;     // age = age / 10;

        age %= 10;     // age = age % 10;

        System.out.println(age);


        int a1 = 20;
        int b = 20;

        boolean ans = a1 != b;

        System.out.println(ans);

        //Avoid doing this:
        // int age = age + 2;

        // System.out.println(age);

        int a3 = 17;
        int b3 = 3;

        double c3 = a3 * 1.0 / b3;

        System.out.println(c3);
    }
}