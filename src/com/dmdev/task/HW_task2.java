package com.dmdev.task;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class HW_task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        double methodResult = operation(operand1,operand2,operation);
        System.out.println(methodResult);
    }

    public static double operation(double operand1, double operand2, char operation) {

        double result = switch (operation) {
            case '+' ->  operand1 + operand2;
            case '-' ->  operand1 - operand2;
            case '*' ->  operand1 * operand2;
            case '/' ->  operand1 / operand2;
            case '%' ->  operand1 % operand2;
            default -> 0.0;
        };
        return result;
    }
}
