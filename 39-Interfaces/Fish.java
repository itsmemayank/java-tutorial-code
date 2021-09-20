
public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("The Fish is in search for smaller fish.");
    }

    @Override
    public void flee() {
        System.out.println("The Fish is fleeing from larger fish.");
    }
}