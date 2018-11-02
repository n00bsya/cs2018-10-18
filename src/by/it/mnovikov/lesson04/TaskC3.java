package by.it.mnovikov.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {

        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                MnConvertToString(i);
                System.out.print(" умножить на ");
                MnConvertToString(j);
                System.out.print(" равно ");
                int res = i * j;

                ResConvertToString(res);
            }
        }
    }
    private static void MnConvertToString(int a) {
        switch (a) {
            case 1: System.out.print("один"); break;
            case 2: System.out.print("два"); break;
            case 3: System.out.print("три"); break;
            case 4: System.out.print("четыре"); break;
            case 5: System.out.print("пять"); break;
            case 6: System.out.print("шесть"); break;
            case 7: System.out.print("семь"); break;
            case 8: System.out.print("восемь"); break;
            case 9: System.out.print("девять"); break;
            case 10: System.out.print("десять"); break;
            default: break;
        }
    }
    private static void ResConvertToString(int res) {
        if (res < 20) {
            switch (res) {
                case 4: System.out.println("четыре"); break;
                case 6: System.out.println("шесть"); break;
                case 8: System.out.println("восемь"); break;
                case 9: System.out.println("девять"); break;
                case 10: System.out.println("десять"); break;
                case 12: System.out.println("двенадцать"); break;
                case 14: System.out.println("четырнадцать"); break;
                case 15: System.out.println("пятнадцать"); break;
                case 16: System.out.println("шестнадцать"); break;
                case 18: System.out.println("восемнадцать"); break;
                default: System.out.println(); break;
            }
        }
        else {
            switch ((res/10)*10) {
                case 20: System.out.print("двадцать "); break;
                case 30: System.out.print("тридцать "); break;
                case 40: System.out.print("сорок "); break;
                case 50: System.out.print("пятьдесят "); break;
                case 60: System.out.print("шестьдесят "); break;
                case 70: System.out.print("семьдесят "); break;
                case 80: System.out.print("восемьдесят "); break;
                case 90: System.out.print("девяносто "); break;
                default: System.out.print("сто"); break;
            }
            MnConvertToString(res%10);
            System.out.println();
        }
    }
}