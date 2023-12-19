package at.konstantin.Lists;

public interface List<E> {
    void add(E element);
    void remove(int index);
    E get(int index);

    void print();
}