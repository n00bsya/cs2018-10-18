package by.it.mnovikov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/


import java.util.Scanner;

class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();

        int Sum = a + b;

        System.out.println("Sum = " + Sum);
    }
}
