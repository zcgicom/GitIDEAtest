package com.demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.demo.test.EInputReader;
import com.demo.test.Cat;


/**
 * @author Chen
 * @create 2020-06-12 9:38
 */
public class AbilityTest {
    public static void main(String[] args)  {
//        new EInputReader().inputreader();
//        EInputReader eInputReader = new EInputReader();
//        eInputReader.inputreader();
        AbilityTest test = new AbilityTest();
//        test.show();
//        test.dodule_judge_age();
//        test.multi_jude_age();

        test.cat_jude();
    }
    public void show(){//基本测试
        try{
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader dr = new BufferedReader(sr);
        System.out.println("first num:");
        String sdr = dr.readLine();
        System.out.println("second num:");
        String sdr1 = dr.readLine();

        float num1 = Float.parseFloat(sdr);
        float num2 = Float.parseFloat(sdr1);
        if(num1 > num2){
            System.out.println(sdr+"较大！");
        }
        else {
            System.out.println(sdr1+"较大！");
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public void dodule_judge_age(){//单分支判断
        System.out.println("please input your age:");
        Scanner br = new Scanner(System.in);
        int age = br.nextInt();
        if(age >= 18){
            System.out.println("you have a adult!");
        }
        else{
            System.out.println("you have a kid!");
        }
    }
    public void multi_jude_age(){//多分支Switch语句
        System.out.println("please a char:");
        Scanner br = new Scanner(System.in);
        String isr = br.next();
        switch (isr){
            case "a":
                System.out.println("星期一");
                break;
            case "b":
                System.out.println("星期二");
            case "c":
                System.out.println("星期三");
                break;
            case "d":
                System.out.println("星期四");
            case "e":
                System.out.println("星期五");
                break;
            case "f":
                System.out.println("星期六");
                break;
            default:
                System.out.println("周末");
                break;
        }
    }
    public void cat_jude(){
        Cat cat1 = new Cat();   //示例对象
        cat1.name = "小花";   //成员变量
        cat1.age = 22;
        cat1.color = "花色";
        Cat cat2 = new Cat();
        cat2.name = "小黑";
        cat2.age = 12;
        cat2.color = "黑色";

        cat2.eat(); //成员方法
        int num = cat1.add(1,4);    //成员方法
        System.out.println("result:"+num);
        System.out.println("Please a name of cat:");
        Scanner br = new Scanner(System.in);    //创建键盘扫描对象
        String cat_name = br.next();            //获取输入字符
        System.out.println(cat1.name);
        if(cat_name.equals(cat1.name)){ //Java中通常使用“str1.equals(str2)”方法比较字符长是否相等，使用“！str1.equals(str2)”表示不等
            System.out.println("张老太有一只叫"+cat1.name+"的"+cat1.color+"小猫，这只小猫的年龄已经有"+cat1.age+"了。");
        }
        else if(cat_name.equals(cat2.name)){
            System.out.println("张老太有一只叫"+cat2.name+"的"+cat2.color+"小猫，这只小猫的年龄已经有"+cat2.age+"了。");
        }
        else {
            System.out.println("张老太没有养猫！");
        }
    }

}
