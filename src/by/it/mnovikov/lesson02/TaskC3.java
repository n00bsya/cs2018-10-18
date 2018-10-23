package by.it.mnovikov.lesson02;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class TaskC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w_earth = sc.nextInt();
        double w_mars = getWeight(w_earth);

        System.out.println("Вес тела на марсе составит: " + w_mars);
    }

    private static double getWeight(int weight) {

        double ffa1 = 9.81; //Ускорение свободного падения на Земле
        double ffa2 = 3.86; //Ускорение свободного падения на Марсе
        double k = ffa1 / ffa2;
        double w_mars = weight / k;

        double newDouble = new BigDecimal(w_mars).setScale(2, RoundingMode.HALF_UP).doubleValue();

        return newDouble;

    }

}
