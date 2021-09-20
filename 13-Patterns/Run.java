
// Import Packages
import java.util.Scanner;

class Run {
    public static void main(String[] args) {

        // Nested Loop - a loop inside another loop

        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter size: ");
        size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("\t*\t");
            }
        }

        // Scanner Closed
        sc.close();
    }
}