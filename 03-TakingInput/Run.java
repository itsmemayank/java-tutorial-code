
// Import Packages
import java.util.Scanner;

class Run {
    public static void main(String[] args) {
        // Taking Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clears the scanner
        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        // Displaying Output
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

        // Closing Scanner
        scanner.close();
    }
}