// Set -> EnumSet

import java.util.Set; // Interface
import java.util.EnumSet; // Implements
import java.util.Iterator;

class enumSet {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        Set<Size> sizes1 = EnumSet.allOf(Size.class);
        System.out.println("sizes1: " + sizes1);

        // Creating an EnumSet using noneOf()
        Set<Size> sizes2 = EnumSet.noneOf(Size.class);
        System.out.println("sizes2: " + sizes2);


        System.out.println("\nWorking on Sizes 2: \n");

        // Using add method
        sizes2.add(Size.MEDIUM);
        System.out.println("EnumSet Using add(): " + sizes2);

        // Using addAll() method
        sizes2.addAll(sizes1);
        System.out.println("EnumSet Using addAll(): " + sizes2);

        // Iterator method on sizes2
        Iterator<Size> iterate = sizes2.iterator();

        System.out.print("Iterator EnumSet: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();

        // Using remove()
        boolean value1 = sizes2.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? " + value1);
        System.out.println("Enum Set: " + sizes2);

        // Using removeAll()
        boolean value2 = sizes2.removeAll(sizes2);
        System.out.println("Are all elements removed? " + value2);
        System.out.println("Enum Set: " + sizes2);
 
    }
}