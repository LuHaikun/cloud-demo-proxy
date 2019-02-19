package com.cloud.proxy.statics;

import com.cloud.proxy.statics.service.Person;
import com.cloud.proxy.statics.service.impl.Student;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/17 6:52 PM
 * @Description: 静态代理类
 * @Created with cloud-demo-proxy
 * @Version: 1.0
 */
public class PersonStaticProxy implements Person {
    private Person p;
    public PersonStaticProxy(Person p){
        this.p = p;
    }

    public static void main(String[] args) {
        Student s = new Student();
        PersonStaticProxy p = new PersonStaticProxy(s);
        p.doSomeThing("什么都不会");
        p.saySomeThing("说谎");
    }
    @Override
    public void saySomeThing(String word) {
        System.out.println("------静态代理前置------");
        p.saySomeThing(word);
        System.out.println("------静态代理后置------");
    }
    @Override
    public void doSomeThing(String action) {
        System.out.println("------静态代理前置------");
        p.saySomeThing(action);
        System.out.println("------静态代理后置------");
    }
}
