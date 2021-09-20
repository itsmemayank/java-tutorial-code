import javax.smartcardio.Card;

public class Run {
    public static void main(String[] args) {

        // toString() - return's a string that "textually represents" an object.
        // can be used both explicity and implicitly.

        Car car = new Car();

        System.out.println(car.toString()); // Explicitly
        System.out.println(car); // Implicitly
    }

}