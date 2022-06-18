package com.dmdev.lesson6;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр
 * (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (even) (2, 2, 8, 0)
 * 2 нечетные (odd) (9, 1).
 */
import java.util.Scanner;

public class HW_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();
        System.out.println("Even numbers: " +evenNumbers(value));
        System.out.println("Odd numbers: " +oddNumbers(value));
    }

    public static int evenNumbers(int value){
        int amountEven = 0;
        for (int currentValue = value; currentValue !=0; currentValue /= 10) {
            double result = currentValue % 2;
            if (result == 0){
                amountEven++;
            }
        }
        return amountEven;
    }

    public static int oddNumbers(int value){
        int amountOdd = 0;
        for (int currentValue = value; currentValue !=0; currentValue /= 10) {
            double result = currentValue % 2;
            if (result != 0){
                amountOdd++;
            }
        }
        return amountOdd;
    }
}
