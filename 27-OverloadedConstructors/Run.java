
public class Run {
    public static void main(String[] args) {

        // Overloaded Constructor - multiple constructors within a class with the same
        // name, but have different parameters.

        Pizza pizza1 = new Pizza("Thick Crust", "Tomato", "Mozzarella", "Pepperoni");
        Pizza pizza2 = new Pizza("Hand Tossed", "Tomato", "Mozzarella");

        System.out.println("Ingredients of Pizza: With Topping ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println();

        System.out.println("Ingredients of Pizza: Without Topping ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

    }

}