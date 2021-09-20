
public class Run {
    public static void main(String[] args) {

        /*
         * Switch - statements that allows a variable to be tested for equality against
         * a list of values.
         */

        int day = 1;

        switch (day) {
        case 0:
            System.out.println("Today is Monday.");
            break;

        case 1:
            System.out.println("Today is Tuesday.");
            break;

        case 2:
            System.out.println("Today is Wednesday.");
            break;

        case 3:
            System.out.println("Today is Thursday.");
            break;

        case 4:
            System.out.println("Today is Friday.");
            break;

        case 5:
            System.out.println("Today is Saturday.");
            break;

        case 6:
            System.out.println("Today is Sunday.");
            break;

        default:
            System.out.println("Invalid");
        }
    }
}
