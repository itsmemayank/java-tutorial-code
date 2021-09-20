
public class Run {

    public static void main(String[] args) {

        // Here we've used message() method on new Run() which is an anonymous
        // object.

        System.out.println(new Run().message());
    }

    public String message() {
        return "Hello World!";
    }
}