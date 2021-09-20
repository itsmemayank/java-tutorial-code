
// Import Packages
import java.util.Scanner;

class Run {
    public static void main(String[] args) {

        // Dynamic Polymorphism - Run Time

        // Scanner Initialized
        Scanner sc = new Scanner(System.in);

        // Instantiation of Animal - we dont know what animal it will be
        Animal animal;

        System.out.println("Enter your favorite animal: ");
        System.out.print("(1=Dog) and (2=Cat): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            // Creating constructor of Dog class
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            // Creating constructor of Cat class
            animal = new Cat();
            animal.speak();
        } else {
            // If choice other than 1,2 then it will create constructor Animal class
            animal = new Animal();
            animal.speak();
        }

        // Scanner Closed
        sc.close();

    }
}