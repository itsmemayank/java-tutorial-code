import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

class Run {
    public static void main(String[] args) {

        // put(): If the linked blocking queue is full, it waits until there is space in
        // the linked blocking queue to insert the element.
        // take(): If the linked blocking queue is empty, it waits until there are
        // elements in the linked blocking queue to be deleted.

        LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // offer elements
        animals.offer("Cow");
        animals.offer("Giraffe");
        animals.offer("Elephant");
        System.out.println("LinkedBlockingQueue: " + animals);

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
        System.out.print("Updated LinkedBlockingQueue Elements: ");

        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }

        // Using clear()
        animals.clear();
        System.out.println();
        System.out.println("Updated LinkedBlockingQueue: " + animals);

    }
}

/*
 * import java.util.concurrent.LinkedBlockingQueue;
 * 
 * class Main { public static void main(String[] args) {
 * LinkedBlockingQueue<String> animals = new LinkedBlockingQueue<>(5);
 * 
 * try { //Add elements to animals animals.put("Dog"); animals.put("Cat");
 * System.out.println("LinkedBlockingQueue: " + animals);
 * 
 * // Remove an element String element = animals.take();
 * System.out.println("Removed Element: " + element);
 * System.out.println("New LinkedBlockingQueue: " + animals); }
 * catch(java.lang.Exception e) { System.out.println(e); } } }
 * 
 */