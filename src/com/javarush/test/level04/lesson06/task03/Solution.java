package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();//напишите тут ваш код
        String s2 = reader.readLine();//напишите тут ваш код
        String s3 = reader.readLine();//напишите тут ваш код

        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);

        if (a > b && a > c) {
            System.out.println(a);
            if(b > c) {
                System.out.println(b);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b > a && b > c) {
            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else if (c > a && c > b) {
            System.out.println(c);
            if (b > a) {
                System.out.println(b);
                System.out.println(a);
            }
            else {
                System.out.println(a);
                System.out.println(b);
            }
        }


    }


}

