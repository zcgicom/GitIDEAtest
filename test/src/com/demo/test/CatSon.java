package com.demo.test;

/**
 * @author Chen
 * @create 2020-06-13 14:18
 */
public class CatSon extends Cat{
    public CatSon(String name, int age, String color) {
        super(name, age, color);//调用子类的构造方法之前，会先利用super调用父类的构造方法
        super.name = name;//与this在勒种方法类似，super关键字用于指向父类，并通过该关键字操作父类成员
        System.out.println(super.name);
    }
    public void showinof(){//子类与父类有相同的成员方法，子类会覆盖父类的方法 -- 方法的覆盖
        System.out.println("Cat name is "+this.name);
    }
}
