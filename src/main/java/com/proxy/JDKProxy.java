package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author hang.yuan
 * @Date 2022/9/21 13:59
 * @Description
 * @Ref
 */
public class JDKProxy {

    public static void main(String[] args) {

        Class[] interfaces = {UserDao.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });

        UserDaoImpl userDao = new UserDaoImpl();
        UserDao userdao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = userdao.add(1, 2);
        System.out.println("result: " + result);

    }

}

class UserDaoProxy implements InvocationHandler{

    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 执行方法之前
        System.out.println("Before run method the method name is " + method.getName() + " and the args is " + Arrays.toString(args));

        // 执行增强的方法
        Object res = method.invoke(obj, args);

        // 执行方法之后
        System.out.println("After run method " + obj);

        return res;
    }
}
