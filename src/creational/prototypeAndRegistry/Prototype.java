package creational.prototypeAndRegistry;

// similar to marker interface
public interface Prototype<T> {

    T clone();
}
