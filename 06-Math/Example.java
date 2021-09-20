
// Import Packages
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        double x, y, z;

        Scanner sc = new Scanner(System.in);

        // Side x
        System.out.println("Enter side x: ");
        x = sc.nextDouble();

        // Side y
        System.out.println("Enter side y: ");
        y = sc.nextDouble();

        // Hypotenuse
        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The Hypotenuse is: " + z);

        sc.close();
    }
}
