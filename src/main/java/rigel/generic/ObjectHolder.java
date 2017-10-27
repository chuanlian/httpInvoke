package rigel.generic;

import java.io.Serializable;

public class ObjectHolder<T extends Comparable & Serializable> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    /**
     * 获取最小值
     *
     * @param a
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T getMin(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T small = a[0];
        for (int k = 1; k < a.length; k++) {
            if (small.compareTo(a[k]) > 0) {
                small = a[k];
            }
        }
        return small;
    }
}
