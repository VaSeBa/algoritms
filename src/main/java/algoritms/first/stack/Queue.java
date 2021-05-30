package algoritms.first.stack;

public interface Queue<T> {
    void add(T item);
    T remove();

    boolean isEmpty();
}
