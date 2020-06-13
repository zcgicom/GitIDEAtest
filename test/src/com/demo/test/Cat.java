package com.demo.test;

/**
 * @author Chen
 * @create 2020-06-12 15:09
 */
public class Cat {
    //成员变量
    String name;
    int age;
    String color;

    //成员方法
    public void eat(){
        System.out.println("调用成员方法eat()的结果：猫总会吃猫粮！");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){//add方法重载，多个方法名相同，参数列表不同；只需要记住一个方法名称就可实现类似功能。
        return a+b+c;
    }
    public Cat(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void showinof(){
        System.out.println("猫的名字是："+this.name);
    }
}
