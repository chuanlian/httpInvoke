package senior.thread;

public class IDGenerator {
    private int value = 0;

    public int getNext() {
        return value++;
    }
}
