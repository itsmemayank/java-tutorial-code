
// Import Packages
import java.util.Scanner;

class Run {
    public static void main(String[] args) {

        // Logical Operator - used to connect two or more expressions

        // && - both condition must be true
        int temp = 36;

        if (temp > 32) {
            System.out.println("It is hot outside.");
        } else if (temp >= 26 && temp <= 32) {
            System.out.println("It is normal outside.");
        } else {
            System.out.println("It is cold outside.");
        }

        // || - either condition must be true
        Scanner sc = new Scanner(System.in);

        System.out.println("Press q or Q to exit: ");
        String response = sc.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You have exited.");
        } else {
            System.out.println("You are still in there.");
        }

        sc.close(); // Scanner Closed

        // ! - reverses boolean value of condition
        boolean isNotWorking = true;

        if (!isNotWorking) {
            System.out.println("Keep it up.");
        } else {
            System.out.println("Do something.");
        }

    }
}