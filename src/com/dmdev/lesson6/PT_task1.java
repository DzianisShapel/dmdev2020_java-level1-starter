package com.dmdev.lesson6;

import java.util.Scanner;

/**
Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 число 148
 1+4+8 = 13
 */

public class PT_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = scanner.nextInt();

        System.out.println("Sum digits: " +sum(value));
    }

    public static int sum(int digit){
        int result = 0;
        for(int currentValue = digit; currentValue !=0; currentValue /= 10) {
            result += currentValue % 10;
        }

        return result;
    }


}
