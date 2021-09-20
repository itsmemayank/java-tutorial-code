
// Import Packages
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        // Method - a block of code that is executed whenever it is called.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Method Call
        greeting(name, age /* Passing Arguments */);

        // Scanner Closed
        sc.close();
    }

    static void greeting(String name, int age /* Passing Parameters */) {
        System.out.println("Hello, " + name);
        System.out.println("Your age is " + age);
    }
}