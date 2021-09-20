
// Import Packages
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        // While Loop - executes a block of code as long as it's condition is true

        Scanner sc = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello, " + name);

        // Scanner Closed
        sc.close();
    }
}
