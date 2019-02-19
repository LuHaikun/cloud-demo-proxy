package com.cloud.proxy.dynamic;

import com.cloud.proxy.statics.service.Person;
import com.cloud.proxy.statics.service.impl.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/17 6:52 PM
 * @Description: 动态代理类
 * @Created with cloud-demo-proxy
 * @Version: 1.0
 */
public class PersonDynamicProxy implements InvocationHandler {
    private Object o;
    public PersonDynamicProxy(Object o){
        this.o = o;
    }

    public static void main(String[] args) {
        Student s = new Student();
        PersonDynamicProxy p = new PersonDynamicProxy(s);
        Person person = (Person)p.newProxyInstance();
        person.saySomeThing("说谎");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------动态代理前置------");
        method.invoke(o,args);
        System.out.println("------动态代理后置------");
        return null;
    }

    public Object newProxyInstance () {
       return Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),this);
    }
}
