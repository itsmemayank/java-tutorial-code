
public class Run {
    public static void main(String[] args) {

        // Polymorphism - the ability of an object to identify as more than one type
        // Poly - "many"
        // Morph - "forms"
        // Static Polymorphism - Compile Time

        // car is a type of Car as well as Vehicle
        Car car = new Car();

        // bicycle is a type of Bicycle as well as Vehicle
        Bicycle bicycle = new Bicycle();

        // boat is a type of Boat as well as Vehicle
        Boat boat = new Boat();

        // Storing all objects in Vehicle array
        Vehicle[] racers = { car, bicycle, boat };

        for (Vehicle vehicle : racers) {
            vehicle.go();
        }
    }
}