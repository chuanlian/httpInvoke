package rigel.generic;

public class TestMain {

    public static void main(String[] args) {
        ObjectHolder<String> objectHolder = new ObjectHolder<String>();
        objectHolder.setObj("yangchuanlian");
        System.out.println(objectHolder.getObj());

        String[] names = new String[2];
        names[0] = "alex";
        names[1] = "bruce";
        System.out.println(ObjectHolder.getMin(names));
    }
}
