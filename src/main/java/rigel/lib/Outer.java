/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package rigel.lib;

/**
 * @author yangchuanlian
 * 
 */
public class Outer {

    private static Integer age = 20;

    public String code = "X201";

    class Inner {

        private String code = "X202";

        public void print() {
            System.out.println(age);
            System.out.println(Outer.this.code);
            System.out.println(this.code);
        }
    }

    static class Tool {

        public static String age1 = "Tool-20";

        public void print() {
            System.out.println(age);
            System.out.println(Outer.age);
        }
    }

}
