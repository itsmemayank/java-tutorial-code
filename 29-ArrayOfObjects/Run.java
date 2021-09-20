
class Run {
    public static void main(String[] args) {

        // Array of Food Class
        Food[] store = new Food[3];

        // Food Object
        Food obj1 = new Food("Pizza");
        Food obj2 = new Food("Burger");
        Food obj3 = new Food("Burger");

        // Storing Food in Store
        store[0] = obj1;
        store[1] = obj2;
        store[2] = obj3;

        // Displaying Food
        for (Food item : store) {
            System.out.println(item.name);
        }
    }
}