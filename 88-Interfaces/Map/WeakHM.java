// keys of weak hashmaps are of weak reference type. 
// This means the entry of a map are removed by the garbage collector if the key to that entry is no longer used. 

import java.util.WeakHashMap;

class WeakHM {
    public static void main(String[] args) {
        // Creating WeakHashMap of even numbers
        WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

        String one = new String("One");
        Integer oneValue = 1;
        numbers.put(one, oneValue);

        String two = new String("Two");
        Integer twoValue = 2;
        numbers.put(two, twoValue);

        System.out.println("WeakHashMap: " + numbers);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());

        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());

        // Using values()
        System.out.println("Values: " + numbers.values());


        /*
            // Make the reference null
            two = null;

            // Perform garbage collection
            System.gc();
        */

        // Updated map
        System.out.println("Updated WeakHashMap: " + numbers);
    }
}