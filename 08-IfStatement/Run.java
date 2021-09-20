
public class Run {
    public static void main(String[] args) {

        /*
         * If Statement - performs a block of code if it's condition evaluates to be
         * true
         */

        int age = 15;

        if (age <= 18) {
            System.out.println("Young");
        } else if (age > 18 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");
        }
    }
}
