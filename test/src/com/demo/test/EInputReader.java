package com.demo.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Chen
 * @create 2020-06-12 9:38
 */
public class EInputReader {
    public void inputreader() {
        try{
            System.out.println("Input a char:");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(isr);
            String br = bf.readLine();
            System.out.println(br);}
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
