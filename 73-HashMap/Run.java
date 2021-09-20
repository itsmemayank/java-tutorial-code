
// Import Packages
import java.util.HashMap;

public class Run {

    public static void main(String[] args) {

        // HashMap - implements the map interface
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class

        HashMap<String, String> countries = new HashMap<>();

        // Add Item
        countries.put("USA", "Washington DC");
        countries.put("India", "Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        // Remove Item
        countries.remove("China");

        // Accessing Item
        String item = countries.get("India");
        System.out.println(item);

        // Size of Map
        System.out.println(countries.size());

        // Replace Item
        countries.replace("USA", "Washington DC", "Washington");

        // Search Key/Value
        System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("Delhi"));

        // Looping
        for (String country : countries.keySet()) {
            System.out.println(country + " = " + countries.get(country));
        }

    }
}