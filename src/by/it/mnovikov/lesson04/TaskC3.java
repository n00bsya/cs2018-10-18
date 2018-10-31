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
        for (int i=2; i<=10; i++ ){
            for (int j=2; j<=10; j++){
                switch (i){
                    case 2: System.out.print("два"); break;
                    case 3: System.out.print("три"); break;
                    case 4: System.out.print("четыре"); break;
                    case 5: System.out.print("пять"); break;
                    case 6: System.out.print("шесть"); break;
                    case 7: System.out.print("семь"); break;
                    case 8: System.out.print("восемь"); break;
                    case 9: System.out.print("девять"); break;
                    default: System.out.print("десять"); break;
            }
                System.out.print(" умножить на ");
                switch (j){
                    case 2: System.out.print("два"); break;
                    case 3: System.out.print("три"); break;
                    case 4: System.out.print("четыре"); break;
                    case 5: System.out.print("пять"); break;
                    case 6: System.out.print("шесть"); break;
                    case 7: System.out.print("семь"); break;
                    case 8: System.out.print("восемь"); break;
                    case 9: System.out.print("девять"); break;
                    default: System.out.print("десять"); break;
                }
                System.out.print(" равно ");
                int res = i * j;
                System.out.println(res);
            }
        }
    }
}
