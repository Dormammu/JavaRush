package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream=new FileInputStream(reader.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for (;fileInputStream.read()>0;) {
            list.add(fileInputStream.read());
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println(max);
        fileInputStream.close();
    }
}
