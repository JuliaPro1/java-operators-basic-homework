package ru.ulyaprohorofa;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class JavaOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 21;
        double c = 14.6;

        // 0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("a % b = " + (a % b));
        System.out.println("a-- = " + (a--));
        System.out.println("--a = " + (--a));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println();

        // 1) применить несколько арифметических операций над int и double в одном выражении
        System.out.println("(b - c) / a * b = " + ((b - c) / a * b));
        System.out.println();

        // 2) применить несколько логических операций ( < , >, >=, <= )
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a != c: " + (a != c));
        System.out.println("a == c: " + (a == c));
        System.out.println();

        /*3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
         * (какие максимальные и минимальные значения есть, как их получить) и переполнение
         *
         * Тип float
         * Размер: 32 бита (4 байта)
         * Диапазон значений:
         * Минимальное положительное значение: примерно $1.4 × 10^{-45}$
         * Максимальное положительное значение: примерно $3.4 × 10^{38}$
         * Для получения максимального и минимального значений используются соответственно Float.MIN_VALUE и Float.MAX_VALUE
         *
         * Тип double
         * Размер: 64 бита (8 байт)
         * Диапазон значений:
         * Минимальное положительное значение: примерно $4.9 × 10^{-324}$
         * Максимальное положительное значение: примерно $1.7 × 10^{308}$
         * Для получения максимального и минимального значений используются соответственно Double.MIN_VALUE и Double.MAX_VALUE
         *
         * Переполнение возникает тогда, когда результат операции выходит за пределы допустимого диапазона переменной.
         * При выходе за границы диапазонов возникают особые значения вроде бесконечности (Infinity), отрицательной бесконечности (-Infinity)
         * */

        // 4) получить переполнение при арифметической операции
        float minF = Float.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        double minD = Double.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        System.out.println("Переполнение float в большую сторону: " + (maxF * 2));
        System.out.println("Переполнение float в меньшую сторону: " + (minF / 2));
        System.out.println("Переполнение double в большую сторону: " + (maxD * 2));
        System.out.println("Переполнение double в меньшую сторону: " + (minD / 2));


    }
}
