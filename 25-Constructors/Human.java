
public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this + " object is eating bread and butter.");
    }

    void walk() {
        System.out.println(this + " object is taking a walk.");
    }
}