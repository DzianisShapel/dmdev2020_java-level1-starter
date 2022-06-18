package com.dmdev.task;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task6 {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);

        int result2 = sumFor(value);
        System.out.println(result2);
    }

    public static int sum(int value){
        int result = 0;
        int currentValue =value;
        while (currentValue != 0) {
            result += currentValue % 10;  //забираем остаток от деления в нашем примере 5
            currentValue /= 10; //убираем 5 от 12345, чтобы в следующий раз уже было 1234 и в следующем цикле был остаток от деления был 4
        }


        return result;
    }

    public static int sumFor(int value){
        int result = 0;
        for (int currentValue = value; currentValue !=0; currentValue /= 10){
            result += currentValue % 10;
        }
        return result;
    }

}
