
class Run {
    public static void main(String[] args) {

        // Encapsulation - attributes of a class will be hidden or private,
        // can be accessed only through methods (getters and setters).

        Car car = new Car();

        car.setName("Mercedes");
        car.setModel("C1");
        car.setYear(2020);

        System.out.println(car.getName());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}