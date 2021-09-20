
// Import Packages
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        /*
         * Lambda Expression - feature for Java 8 and above also known as an anonymous
         * method a shorter way to write anonymous classes with only one method
         *
         * need to use a functional interface or use a pre-defined functional interface
         * they contain only one abstract method ex. ActionListener, Runnable,
         * (user-defined)
         *
         * A Lambda expression can be used in any place where a functional interface is
         * required How to use a lambda expression: (arguments) -> {statement/s}
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter 2nd no: ");
        int num2 = sc.nextInt();
        System.out.print("\nChoose operator '1-Add, 2-Subtract, 3-Multiply, 4-Divide': ");
        int operator = sc.nextInt();

        // Lambda Expression
        MyInterface myInterface = (int x, int y, int op) -> {
            switch (op) {
                case 1:
                    System.out.println("\nResult is: " + (x + y));
                    break;

                case 2:
                    System.out.println("\nResult is: " + (x - y));
                    break;

                case 3:
                    System.out.println("\nResult is: " + (x * y));
                    break;

                case 4:
                    System.out.println("\nResult is: " + (x / y));
                    break;

                default:
                    System.out.println("\nInvalid Input!");
                    break;
            }

        };

        // Calling method
        myInterface.calculator(num1, num2, operator);
    }
}