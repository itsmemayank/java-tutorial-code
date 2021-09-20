
class Run {
    public static void main(String[] args) {

        Car car1 = new Car("Chevrolet", "Camaro", 2021);

        // Passing car1 as a constructor
        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println("Car1: " + car1.getMake());
        System.out.println("Car1: " + car1.getModel());
        System.out.println("Car1: " + car1.getYear());

        System.out.println();

        System.out.println("Car2: " + car2.getMake());
        System.out.println("Car2: " + car2.getModel());
        System.out.println("Car2: " + car2.getYear());

    }
}