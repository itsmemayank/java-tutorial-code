import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

class Run {
    public static void main(String[] args) {

        // put(): If the array blocking queue is full, it waits until there is space in
        // the array blocking queue to add an element.
        // take(): If the array blocking queue is empty, it waits until there are
        // elements in the array blocking queue to be deleted.

        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(6);

        // Using add()
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Using offer()
        animals.offer("Cow");
        animals.offer("Giraffe");
        animals.offer("Elephant");
        System.out.println("ArrayBlockingQueue: " + animals);

        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Elements: ");
        System.out.println("Using remove(): " + element1);

        // Using poll()
        String element2 = animals.poll();
        System.out.println("Using poll(): " + element2);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Updated ArrayBlockingQueue Elements: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }

        // Using clear()
        animals.clear();
        System.out.println();
        System.out.println("After clear() ArrayBlockingQueue: " + animals);
    }
}

/*
 * import java.util.concurrent.ArrayBlockingQueue;
 * 
 * class Main { public static void main(String[] args) {
 * ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
 * 
 * try { //Add elements to animals animals.put("Dog"); animals.put("Cat");
 * System.out.println("ArrayBlockingQueue: " + animals);
 * 
 * // Remove an element String element = animals.take();
 * System.out.println("Removed Element: " + element); }
 * catch(java.lang.Exception e) { System.out.println(e); } } }
 * 
 */
