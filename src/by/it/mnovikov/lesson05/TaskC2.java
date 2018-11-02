package by.it.mnovikov.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {//Напишите тут ваш код

    public static void main(String[] args) {
        int[] numbers = new int[20];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

    }

    public static void sort(int[] array) {//Напишите тут ваш код
        for (int i=0; i<array.length; i++)
            for (int j=0; j<array.length-i-1; j++)
        if (array[j]<array[j+1]) {
            int tmp = array[j];
            array[j]=array[j+1];
            array[j+1]=tmp;
        }
        }
    }
//23 56 74 56 98 45 68 45 2 3 45 77 56 34 27 35 24 28 55 78