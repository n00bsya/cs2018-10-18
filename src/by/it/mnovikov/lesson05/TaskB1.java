package by.it.mnovikov.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("строка 1");
        list.add("строка 2");
        list.add("стркоа 3");
        list.add("строка 4");
        list.add("стркоа 5");
        System.out.println(list.size());
        for (String element: list) {
            System.out.println(element);
        }
    }

}
