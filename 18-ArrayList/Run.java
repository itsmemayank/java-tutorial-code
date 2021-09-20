
// Import Packages
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        // ArrayList - a resizable array.
        // store reference datatypes.
        // elements can be added or removed after compilation phase.

        ArrayList<String> food = new ArrayList<String>();

        // Adding into arraylist
        food.add("pizza");
        food.add("hamburger");
        food.add("tacos");

        // Replace
        food.set(2, "hotdog");

        // Remove
        food.remove(2);

        // Clear List
        food.clear();

        // Displaying result
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        // Displaying result in a more better way
        for (String item : food) {
            System.out.println(item);
        }

    }
}
