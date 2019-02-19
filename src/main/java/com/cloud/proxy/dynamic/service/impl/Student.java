package com.cloud.proxy.dynamic.service.impl;

import com.cloud.proxy.dynamic.service.Person;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/17 6:52 PM
 * @Description:
 * @Created with cloud-demo-proxy
 * @Version: 1.0
 */
public class Student implements Person {
    @Override
    public void saySomeThing(String word) {
        System.out.println("学生会说什么：" + word);
    }
    @Override
    public void doSomeThing(String action) {
        System.out.println("学生会做什么：" + action);
    }
}
