// The NavigableSet is considered as a type of SortedSet. 
// It is because NavigableSet extends the SortedSet interface.
// SortedSet is a Super Interface.
// Set -> SortedSet -> NavigableSet -> TreeSet

import java.util.NavigableSet; // Interface
import java.util.TreeSet; // Implements

class navigableSet {

    public static void main(String[] args) {
        // Creating NavigableSet using the TreeSet
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Insert elements to the set
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println("NavigableSet: " + numbers);

        // Access the first element
        int firstElement = numbers.first();
        System.out.println("First Number: " + firstElement);

        // Access the last element
        int lastElement = numbers.last();
        System.out.println("Last Element: " + lastElement);

        // Remove the first element
        int number1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + number1);

        // Remove the last element
        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);

    }
}