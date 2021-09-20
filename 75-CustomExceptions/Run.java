
// Import Packages
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        // Exception - an event, after execution that disrupts normal flow of
        // the program.
        // user defined exception = custom exception

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("A problem occured: " + e);
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("\n" + "You must be 18+ to sign up.");
        } else {
            System.out.println("You are now signed up!");
        }
    }
}