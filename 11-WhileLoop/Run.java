
// Import packages
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        // While Loop - executes a block of code as long it's condition is true.

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Welcome, " + name);

        // Closed Scanner
        scanner.close();
    }
}