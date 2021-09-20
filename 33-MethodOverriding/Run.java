
class Run {
    public static void main(String[] args) {

        // Method Overriding - Declaring a method in subclass,
        // which is already present in parent class,
        // so that a child class can give its own implementation

        // Animal - parent class
        Animal animal = new Animal();
        animal.speak();

        // Dog - child class
        Dog dog = new Dog();
        dog.speak();

        // If dog doesn't have that method then it will look for it in its parent class
        dog.eat();
    }
}