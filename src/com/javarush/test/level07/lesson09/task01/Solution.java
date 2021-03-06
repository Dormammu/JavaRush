package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> numbers=new ArrayList<Integer>();//напишите тут ваш код
        ArrayList<Integer> num3=new ArrayList<Integer>();//напишите тут ваш код
        ArrayList<Integer> num2=new ArrayList<Integer>();//напишите тут ваш код
        ArrayList<Integer> numothers=new ArrayList<Integer>();//напишите тут ваш код

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <20 ; i++)
        {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i <numbers.size() ; i++) {
            int x=numbers.get(i);
            if (x%3==0)num3.add(x);
            if (x%2==0)num2.add(x);
            else if (x%3!=0&&x%2!=0) numothers.add(x);


        }

        printList(num3);
        printList(num2);
        printList(numothers);

    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i <list.size() ; i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();//напишите тут ваш код
    }

}
