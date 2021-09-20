
public class Run {
    public static void main(String[] args) {
        /*
         * Expression = Operand + Operators Operand = Values, Variable, Numbers,
         * Quantity Operators = + - * / %
         */

        int friends = 20;

        friends += 2; // Addition
        System.out.println(friends);

        friends -= 2; // Subtraction
        System.out.println(friends);

        friends *= 4; // Multiplication
        System.out.println(friends);

        friends /= 2; // Division
        System.out.println(friends);

        friends %= 3; // Modulus
        System.out.println(friends);

        // Type Casting
        int number = 10;
        double decimalNum = (double) number / 3;
        System.out.println(decimalNum);

    }
}
