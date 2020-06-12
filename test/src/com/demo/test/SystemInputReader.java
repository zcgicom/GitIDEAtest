package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Chen
 * @create 2020-06-12 8:59
 */
public class SystemInputReader {
    public static void main(String[] args) throws IOException {
        //方法一：
        //1.创建输入流对象
        System.out.println("Input a key:");
        InputStreamReader br = new InputStreamReader(System.in);
        //2.读取缓存
        BufferedReader sr = new BufferedReader(br);
        //3.读取输入对象
        String isr = sr.readLine();
        //4.输出输入对象
        System.out.println(isr);

        //方法二：
        System.out.println("Input a key:");
        char i =(char)System.in.read();
        System.out.println(i);

        //方法三：最强大的一种获取方法
        //仅需创建一个扫描对象，然后做一些简单的输入改变即可实现
        Scanner ir = new Scanner(System.in);
        System.out.println("Input a name:");
        String name = ir.next();    //ir.nextLine()会将回车当做字符处理，导致程序出现Bug；因此这里可以使用功能相同的ir.next()替代
                                    //ir.next()会忽略空格或Tab等字符。若有有效数据，则遇到有效数据时ir.next()会退出！
        System.out.println("Input a age:");
        int age = ir.nextInt();

        System.out.println("Input a salary:");
        float salary = ir.nextFloat();
        System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"薪资："+salary);


    }
}
