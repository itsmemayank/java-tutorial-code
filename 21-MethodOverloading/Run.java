
public class Run {
    public static void main(String[] args) {

        // Method Overloading - methods that share the same name but have different
        // parameter.

        // Method Call
        int x = add(1, 2);
        System.out.println(x);

        int y = add(1, 2, 3);
        System.out.println(y);

        double z = add(1.5, 3.5);
        System.out.println(z);

    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("This is overloaded method #3");
        return a + b;
    }
}