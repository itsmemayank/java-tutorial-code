
// Import Packages
import java.util.InputMismatchException;
import java.util.Scanner;

class Run {
    public static void main(String[] args) {

        // Exception - an event that occurs during the execution of a program that,
        // disrupts the normal flow of instructions.

        // Scanner Initialized
        Scanner sc = new Scanner(System.in);

        // Try - this block will encounter an error
        // Catch - this block will catch the exception and handle them
        // Finally - this block will execute everytime if there is an error or not

        try {
            System.out.print("\nEnter 1st no: ");
            int x = sc.nextInt();

            System.out.print("\nEnter 2nd no: ");
            int y = sc.nextInt();

            int result = x / y;

            System.out.print("\nResult: " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            // Scanner Closed
            sc.close();
        }

    }
}