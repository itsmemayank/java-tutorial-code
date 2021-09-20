
public class Run {

    public static void main(String[] args) {

        // Default - visible within the package.
        // Public - visible everywhere.
        // Protected - visible outside the package, but the sub class should inherit
        // parent class.
        // Private - visible within the class.

        System.out.println("Default - visible within the package.");
        System.out.println("Public - visible everywhere.");
        System.out.println("Protected - visible outside the package, but the sub class should inherit parent class.");
        System.out.println("Private - visible within the class.");
    }
}