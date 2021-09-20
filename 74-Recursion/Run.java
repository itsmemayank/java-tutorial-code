
// Import packages
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        // Recursion - the process in which the method calls itself continuously.
        // the method that calls itself is called recursive method.

        Scanner sc = new Scanner(System.in);
        System.out.print("How far do you want to walk (in meters): ");
        int dist = sc.nextInt();

        // Calling recursive method
        takeAStep(0, dist);

    }

    static void takeAStep(int n, int dist) {
        if (n <= dist - 2) {
            n++;
            System.out.println("You have reached: " + n + "m.");
            takeAStep(n, dist);
        } else {
            System.out.println("You have completed your goal!");
        }

    }
}