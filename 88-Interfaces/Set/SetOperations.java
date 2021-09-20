import java.util.HashSet;

class SetOperations {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);


        // Union of two set
		primeNumbers.addAll(oddNumbers);
		System.out.println("Union is: " + primeNumbers);

		// Intersection of two sets
		oddNumbers.retainAll(primeNumbers);
		System.out.println("Intersection is: " + oddNumbers);

		// Difference between primeNumbers and oddNumbers
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);

		// Check if oddNumbers is a subset of primeNumbers
		boolean result = primeNumbers.containsAll(oddNumbers);
		System.out.println("Is oddNumbers is subset of primeNumbers? " + result);
    }
}