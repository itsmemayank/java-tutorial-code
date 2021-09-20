
public class Run {

    public static void main(String[] args) {

        // Inner Class - a class inside another class.

        // Instantiating Outside class
        Outside out = new Outside();

        // Calling Inside class from Outside class
        Outside.Inside in = out.new Inside();

        // Printing variable inside Outside and Inside Class
        System.out.println(out.x + in.y);

        // Calling Inside class method
        in.greeting();
    }
}