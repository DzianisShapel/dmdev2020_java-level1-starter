package com.dmdev.lesson5;

/**
 * 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */

public class Task1 {
    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 50;
        int result = getMax(value1, value2);
        System.out.println(result);
    }

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

}
