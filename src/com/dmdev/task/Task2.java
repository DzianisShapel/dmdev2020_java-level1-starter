package com.dmdev.task;

/**
 * Дано целое число. Определить, является ли последня цифра этого числа - цифрой 3
 *
 */
public class Task2 {
    public static void main(String[] args) {
        int value = 912312;
        int testValue = value % 10;
        if (testValue == 3) {
            System.out.println("last digit is 3");
        }
    }
}
