/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.nakri.service.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yangchuanlian
 * 
 */
public class HelloWorldHandler implements InvocationHandler {

    private Object obj;

    public HelloWorldHandler(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        Long start = System.currentTimeMillis();
        doBefore();
        result = method.invoke(obj, args);
        doAfter();
        Long end = System.currentTimeMillis();
        System.out.println("cost time :" + (end - start));
        return result;
    }

    private void doBefore() {
        System.out.println("before method invoke");
    }

    private void doAfter() {
        System.out.println("after method invoke");
    }

}
