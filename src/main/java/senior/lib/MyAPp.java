/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.lib;

import senior.lib.Outer.Inner;

/**
 * @author yangchuanlian
 */
public class MyAPp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();

        inner.print();

        Outer outer = new Outer();

        Inner inner2 = outer.new Inner();
        inner2.print();

        System.out.println(Outer.Tool.age1);

        IAnimal animal = new IAnimal() {

            public void sayHi() {
                System.out.println("MyAPp-hello");
            }
        };
        animal.sayHi();
    }
}
