import java.util.Map;
import java.util.TreeMap;

class Treemap {

    public static void main(String[] args) {
        // Creating Map using TreeMap
        Map<String, Integer> map = new TreeMap<>();

        // Insert elements to map
        map.put("Second", 2);
        map.put("First", 1);
        System.out.println("Map using TreeMap: " + map);

        // Replacing the map
        map.replace("First", 11);
        map.replace("Second", 22);
        System.out.println("New Map: " + map);

        // Remove elements from the map
        int removedValue = map.remove("First");
        System.out.println("Removed Value: " + removedValue);
    }
}