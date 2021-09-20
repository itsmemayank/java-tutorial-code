
public class Run {
    public static void main(String[] args) {

        // 2D Array - array of arrays

        // 2D Array Initialization
        String[][] cars = { { "Camaro", "Corvette", "Silverado" }, { "Mustang", "F-150", "Ferrari" },
                { "Tata", "Ranger", "Tesla" } };

        // Displayin 2D Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]);
                if (j != 2) {
                    System.out.print(" -> ");
                }
            }
        }

    }
}
