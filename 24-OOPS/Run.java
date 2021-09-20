
public class Run {
    public static void main(String[] args) {

        // Object - an instance of a class that may contain attributes and methods.

        Car myObj = new Car();

        System.out.println(myObj.model);
        System.out.println(myObj.color);
        myObj.drive();
        myObj.brake();

    }
}