
public class Run {
    public static void main(String[] args) {

        // Printf - an optional method to control, format and display text to the
        // console window.

        String name = "Mayank Nagora";
        int age = 21;
        double salary = 150000;
        char dollar = '$';
        boolean isWebDeveloper = true;

        // [width]
        /**
         * minimum number of characters to be written as output.
         * System.out.printf("Hello %10s",name);
         */

        // [precision]
        /**
         * sets number of digits of precision when outputting floating-point values
         * System.out.printf("You have this much money %.1f",salary);
         */

        // [flags]
        /*
         * adds an effect to output based on the flag added to format specifier - :
         * left-justify + : output a plus ( + ) or minus ( - ) sign for a numeric value
         * 0 : numeric values are zero-padded , : comma grouping separator if numbers >
         * 1000
         */

        System.out.printf("%nMy name is %s", name);
        System.out.printf("%nI am %d years old", age);
        System.out.printf("%nMy income is %c%,.3f", dollar, salary);
        System.out.printf("%nAnd yeah it's %b, I am a Web Developer", isWebDeveloper);

    }
}