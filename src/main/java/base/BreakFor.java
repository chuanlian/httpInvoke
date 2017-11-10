package base;


/**
 * 跳出双重循环
 */
public class BreakFor {

    public static void main(String args[]) {
        ok:

        for (int k = 0; k < 10; k++) {
            for (int v = 0; v < 10; v++) {
                if (k == 8 && v == 8) {
                    System.out.println("break ok");
                    break ok;
                }
                System.out.println(String.format("k:%s,v:%s", k, v));
            }
        }
    }
}
