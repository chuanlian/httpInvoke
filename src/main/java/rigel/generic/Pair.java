package rigel.generic;

import java.io.Serializable;

public class Pair<T extends Serializable> {

    private T first;
    private T second;

    public Pair() {

    }

    public Pair(T t1, T t2) {
        this.first = t1;
        this.second = t2;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
