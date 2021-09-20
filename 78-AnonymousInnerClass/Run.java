
public class Run {

    public static void main(String[] args) {

        // Anonymous Class - an inner class without a name

        // Instantiating Greeting
        Greeting greeting = new Greeting() {

            // Inner Class
            @Override
            public void welcome() {
                System.out.println("Hello World!");
            }
        };

        greeting.welcome();
    }
}