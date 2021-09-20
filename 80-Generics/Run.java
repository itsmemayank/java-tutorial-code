
public class Run {

    public static void main(String[] args) {

        // Generics - enable types (classes and intefaces) to be parameters when
        // defining classes, interfaces and methods.
        // One method for all reference types.

        // Generics Method
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] strArray = { "Hello", "World" };

        System.out.println("\nGenerics Method: ");
        displayArray(intArray); // pass doubleArray, charArray, strArray
        System.out.println(getFirst(intArray)); // pass doubleArray, charArray, strArray

        // Generics Class

        // Bounded Types = you can create the objects of a generic class to have data
        // of specific derived types ex.Number

        GenericsClass<Integer> myInteger = new GenericsClass<>(1);
        GenericsClass<Double> myDouble = new GenericsClass<>(3.14);
        GenericsClass<Character> myCharacter = new GenericsClass<>('@');
        GenericsClass<String> myString = new GenericsClass<>("Hello");

        System.out.println("\nGenerics Class: ");
        System.out.println(myInteger.getter());
        System.out.println(myDouble.getter());
        System.out.println(myCharacter.getter());
        System.out.println(myString.getter());

    }

    // Here Thing is generics
    public static <Thing> void displayArray(Thing[] array) {

        for (Thing x : array) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    // This method have a return type of Thing
    public static <Thing> Thing getFirst(Thing[] array) {

        return array[0];
    }
}