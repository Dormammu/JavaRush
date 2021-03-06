package com.javarush.test.level31.lesson06.home01;

import java.io.*;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* Добавление файла в архив
В метод main приходит список аргументов.
Первый аргумент - полный путь к файлу fileName.
Второй аргумент - путь к zip-архиву.
Добавить файл (fileName) внутрь архива в директорию 'new'.
Если в архиве есть файл с таким именем, то заменить его.
Пример входных данных:
C:/result.mp3
C:/pathToTest/test.zip
Файлы внутри test.zip:
a.txt
b.txt
После запуска Solution.main архив test.zip должен иметь такое содержимое:
new/result.mp3
a.txt
b.txt
Подсказка: нужно сначала куда-то сохранить содержимое всех энтри,
а потом записать в архив все энтри вместе с добавленным файлом.
Пользоваться файловой системой нельзя.
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        ZipInputStream zis = new ZipInputStream(new FileInputStream(args[1]));
        TreeMap<ZipEntry, byte[]> entries = new TreeMap<>();
        ZipEntry current;
        while ((current = zis.getNextEntry()) != null) {
            byte[] bytes = new byte[(int)current.getSize()];
        }
        zis.close();

    }
}