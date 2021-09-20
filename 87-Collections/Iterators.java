import java.util.ArrayList; // Interface
import java.util.Iterator; // Implements

class Iterators {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of Iterator
        Iterator<Integer> iterate = numbers.iterator();

        // Using the next() method
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        // Using the remove() method
        iterate.remove();
        System.out.println("Removed Element: " + number);


        // Using the hasNext() method
        System.out.print("Updated ArrayList: ");
        while(iterate.hasNext()) {
            // Using the next() method
            System.out.print(iterate.next() + ", ");
        }
    }
}
