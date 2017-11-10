/**
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package senior.nakri;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import senior.nakri.service.HelloWorld;
import senior.nakri.service.impl.HelloWorldHandler;
import senior.nakri.service.impl.HelloWorldImpl;
import senior.nakri.service.impl.TestClass1;

/**
 * @author yangchuanlian
 * 
 */
public class HelloWorldTest {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorldImpl();
        InvocationHandler handler = new HelloWorldHandler(helloWorld);
        // 创建动态代理对象
        HelloWorld proxy =
                (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(), helloWorld.getClass()
                        .getInterfaces(), handler);
        proxy.sayHelloWorld();
        helloWorld.sayHelloWorld();

    }

    private void run() {
        HelloWorld helloWorld = new HelloWorldImpl();
        InvocationHandler handler = new HelloWorldHandler(helloWorld);
        System.out.println(TestClass1.class.getInterfaces().length);
        // 创建动态代理对象
        HelloWorld proxy =
                (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(), helloWorld.getClass()
                        .getInterfaces(), handler);
        proxy.sayHelloWorld();
    }
}
