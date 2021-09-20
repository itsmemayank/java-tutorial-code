
public class Run {
    public static void main(String[] args) {

        // Constructor - a special method that is called when an object is instantiated
        // (or when object is created).

        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Mark", 18, 60);

        System.out.println(human1.name);
        System.out.println(human1.age);
        human1.eat();
        System.out.println();
        System.out.println(human2.name);
        System.out.println(human2.age);
        human2.walk();

    }
}