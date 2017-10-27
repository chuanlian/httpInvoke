package rigel.generic;

import java.io.Serializable;

public class NormalObject implements Serializable {
    private static final long serialVersionUID = 286898321812279932L;

    public static <T> T getMax(T[] t) {
        return null;
    }

    public static Pair<String> getMax(Pair<String> pair) {
        return null;
    }

    //    public static <T> Pair<T> getMin(Pair<T> T) {
    //        return null;
    //    }


    public static <T extends Throwable> void doWork(T t) {
        try {

        } catch (Exception ex) {

        }
    }

    public static void printLn(Pair<? extends Comparable> pair) {


    }

    public static void printLn2(Pair<? super String> pair) {


    }
}
