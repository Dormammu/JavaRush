package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i=0,i2=0,mnog=1,num=1;

        while (i<10){
            while (i2<10){
                System.out.print(num*mnog+" ");
                mnog++;
                i2++;
            }
           i2=0;
            i++;
            num++;
            mnog=1;
            System.out.println();
        }//напишите тут ваш код

    }
}
