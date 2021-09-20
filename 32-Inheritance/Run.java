
class Run {
    public static void main(String[] args) {

        // Inheritance - the process where one class acquires,
        // the attributes and method of another.

        // Car is a child class of Parent Vehicle
        Car car = new Car();
        System.out.println(car.numOfWheels);
        System.out.println(car.speed);

        // Bicycle is a child class of Parent Vehicle
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.numOfWheels);
        System.out.println(bicycle.speed);

    }
}