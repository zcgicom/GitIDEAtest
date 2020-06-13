package com.demo.test;

/**
 * @author Chen
 * @create 2020-06-13 9:15
 */
public class Person {
    String name;
    int age;
    private float salary;
    Cat cat;
    static int i;

    static {
        //静态区域块
        i++;
        System.out.println("静态区域块执行一次：结果运行i="+i);
    }

    public Person(String name,int age,float salary,Cat cat){
        i++;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;

    }
    public void showinof(){
        System.out.println("人名是："+this.name);
    }
}
