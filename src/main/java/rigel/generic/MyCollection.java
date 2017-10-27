package rigel.generic;

import java.util.ArrayList;

public class MyCollection<T extends Comparable> {

    private ArrayList<T> list;

    public T getMin() {
        T min = list.get(0);
        for (int k = 0; k < list.size(); k++) {
            if (min.compareTo(list.get(k)) > 0) {
                min = list.get(k);
            }
        }
        return min;
    }

    public T getMax() {
        T max = list.get(0);
        for (int k = 0; k < list.size(); k++) {
            if (max.compareTo(list.get(k)) < 0) {
                max = list.get(k);
            }
        }
        return max;
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }
}
