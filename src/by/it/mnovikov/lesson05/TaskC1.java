package by.it.mnovikov.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        int[] list = new int[20];
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> d3 = new ArrayList<>();
        ArrayList<Integer> d2 = new ArrayList<>();
        ArrayList<Integer> ost = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            list [i] = scan.nextInt();
        }
        for (int x : list) {
            if (x % 3 == 0 & x % 2 == 0) {
                d3.add(x);
                d2.add(x);
            } else if (x % 3 == 0) {
                d3.add(x);
            } else if (x % 2 == 0) {
                d2.add(x);
            } else ost.add(x);
        }
        printList(d3);
        printList(d2);
        printList(ost);
    }


    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20