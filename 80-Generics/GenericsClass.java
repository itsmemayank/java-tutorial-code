
// T is a short form for Thing
public class GenericsClass<T extends Number> {

    T x;

    GenericsClass(T x) {
        this.x = x;
    }

    public T getter() {
        return x;
    }
}