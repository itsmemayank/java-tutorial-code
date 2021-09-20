
// Import Packages
import java.util.Random;

public class DiceRoller {

    Random random = new Random();; // Global

    DiceRoller() {
        int number = 0; // Local
        roll(number);
    }

    void roll(int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }

}