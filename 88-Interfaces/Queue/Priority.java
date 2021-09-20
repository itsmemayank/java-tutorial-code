import java.util.Queue;
import java.util.PriorityQueue;

class Priority {

    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class
        Queue<Integer> numbers = new PriorityQueue<>();

        // add elements to the Queue
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        System.out.println("Queue: " + numbers);

        // Access head elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        // remove returns true or false 
        // where poll return number itself
        System.out.println("Removed Element: " + removedNumber);

        // Updated Queue
        System.out.println("Updated Queue: " + numbers);

        // Length of Queue
        System.out.println("Length of Queue: " + numbers.size());
    }
}