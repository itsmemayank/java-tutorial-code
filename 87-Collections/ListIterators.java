import java.util.ArrayList; // Interface
import java.util.ListIterator; // Implements

class ListIterators {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        System.out.println("ArrayList: " + numbers);

        // Creating an instance of ListIterator
        ListIterator<Integer> iterate = numbers.listIterator();

        // Using the next() method
        System.out.println("Next Element: " + iterate.next());
        System.out.println("Next Element: " + iterate.next());

        // Using the nextIndex()
        System.out.println("Position of Next Element: " + iterate.nextIndex());

        // Using the hasNext() method
        System.out.println("Is there any next element? " + iterate.hasNext());

        // Using the previous() method
        System.out.println("Previous Element: " + iterate.previous());

        // Using the previousIndex()
        System.out.println("Position of the Previous element: " + iterate.previousIndex());
    }
}
