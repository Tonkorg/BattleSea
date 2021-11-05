package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MAs {
     public static void main(String[] arg)
     {
         /*int number = 10;
         int[] num = new int[number];
         for (int i = 0; i<num.length;i++) {
             num[i] = i*10;

         }
         for (int i = 0; i<num.length;i++) {

             System.out.println(num[i]);
         }
         int[] num1 = {1,2,2,3,4};
        /* for (int i = 0; i<num1.length;i++) {

             System.out.println(num1[i]);
         }*/
         /*String[] strings = new String[3];
         strings[0] = "Привет ";
         strings[1] = " Андрей ";
         strings[2] = " Как дела? ";
         /*System.out.println(string[0]);
         System.out.println(string[2]);*/

         /*for (String string:strings)
         {
             System.out.println(string);
         }*/
         /*int[]number = {1,2,3,4,5};
         int[][] mtrix ={{1,2,3,4,3}, {2,42,23,21,2},{2,23,213,12}};
         System.out.println(mtrix[1][2]);
         String[][] s = new String[2][3];
         s[1][2] = "Hello";
         System.out.println(s[1][2]);*/
         int[][] mas= {{1,2,3},{4,5,6},{7,8,9}};
         for ( int i = 0;i< mas.length;i++) {
             for( int j =0;j<mas[i].length;j++)
             {
                 System.out.print(mas[i][j]);
             }
             System.out.println( );

         }
         System.out.println("Введите новое число");
         Scanner n = new Scanner(System.in);
         int g1 = n.nextInt();
         System.out.println(" Теперь ты в  очереди под номером " + g1);
     }
}
