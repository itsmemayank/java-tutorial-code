// keys of hashmaps are of strong reference type. 
// This means the entry of a map is not removed by the garbage collector even though the key to that entry is no longer used.

import java.util.Map;
import java.util.HashMap;

class Hashmap {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> map = new HashMap<>();

        // Insert elements to the map
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("Map: " + map);

        // Access keys of the map
        System.out.println("Keys: " + map.keySet());

        // Access values of the map
        System.out.println("Values: " + map.values());

        // No of entries
        System.out.println("Entries: " + map.entrySet());

        // Remove Elements from the map
        int value = map.remove("Two");
        System.out.println("Removed Value: " + value);
        
        /*
            // Make the reference null
            two = null;

            // Perform garbage collection
            System.gc();
        */


        // Updated map
        System.out.println("Map: " + map);
    }
}