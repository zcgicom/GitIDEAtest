package com.demo.test;

/**
 * @author Chen
 * @create 2020-06-12 20:15
 */
public class ArrayListTrans {
    public static void main(String[]args){
        int [][] arr = new int[][]{{4,5,6,7},{2,3,9,0}};
        int [][] arrtrans = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arrtrans[j][i]=arr[i][j];
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for(int i=0;i<arrtrans.length;i++){
            for(int j=0;j<arrtrans[0].length;j++){
                System.out.print(arrtrans[i][j]);
            }
            System.out.println();
        }
    }
}
