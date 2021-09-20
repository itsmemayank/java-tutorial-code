
class Run {
    public static void main(String[] args) {

        // Garage Object
        Garage garage = new Garage();

        // Multiple Car Object
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");
        Car car3 = new Car("Mustang");

        // Passing Car in park method through Garage Object
        garage.park(car1);
        garage.park(car2);
        garage.park(car3);

    }
}