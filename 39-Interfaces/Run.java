
public class Run {
    public static void main(String[] args) {

        // Interfaces - a template that can be applied to class.
        // classes can apply more than one interface, inheritance is limited to 1 super.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}