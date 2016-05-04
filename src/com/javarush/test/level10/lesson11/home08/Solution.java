package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> inlist1=new ArrayList<>();
        ArrayList<String> inlist2=new ArrayList<>();
        inlist1.add("Kilbasa");
        inlist1.add("Hleb");
        inlist2.add("Ogyrech");
        inlist2.add("Pomidor");
        list[0]=inlist1;
        list[1]=inlist2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}