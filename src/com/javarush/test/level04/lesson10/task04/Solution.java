package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i=0,i2=0;
        while (i<10){
            while (i2<10){
                System.out.print("S");
                i2++;
            }
            System.out.println();
            i++;
            i2=0;
        }//напишите тут ваш код

    }
}
