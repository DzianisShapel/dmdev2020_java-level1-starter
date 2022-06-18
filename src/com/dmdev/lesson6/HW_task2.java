package com.dmdev.lesson6;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число,
 * а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

import java.util.Scanner;

public class HW_task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();
        while (value > 0) {
            System.out.print(value%10);
            value/=10;
        }
    }

}
