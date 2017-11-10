package senior.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object proxied;

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("safads");
        return method.invoke(proxied, args);
    }
}
