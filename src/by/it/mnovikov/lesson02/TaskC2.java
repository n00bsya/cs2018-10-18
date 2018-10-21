package by.it.mnovikov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/


import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число а");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        int Sum = a + b;

        String binary_a = Integer.toBinaryString(a);
        String binary_b = Integer.toBinaryString(b);
        String binary_Sum = Integer.toBinaryString(Sum);
        String hex_a = Integer.toHexString(a);
        String hex_b = Integer.toHexString(b);
        String hex_Sum = Integer.toHexString(Sum);
        String octal_a = Integer.toOctalString(a);
        String octal_b = Integer.toOctalString(b);
        String octal_Sum = Integer.toOctalString(Sum);

        System.out.println("DEC:" + a + "+" + b + "=" + Sum);
        System.out.println("BIN:" + binary_a + "+" + binary_b + "=" + binary_Sum);
        System.out.println("HEX:" + hex_a + "+" + hex_b + "=" + hex_Sum);
        System.out.println("OCT:" + octal_a + "+" + octal_b + "=" + octal_Sum);

    }


}
