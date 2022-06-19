package com.dmdev.lesson7_arrays;
import java.util.Arrays;
/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел,
 * где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class HW_task2 {
    public static void main(String[] args) {
        char[] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+', '+', 'a', 'b', 'c'};
        System.out.println(Arrays.toString(convertedArray(values)));
    }

    public static int[] convertedArray(char[] values){
        int currentIndex = 0;
        int[] result = new int[calculateArraySize(values)];
        for(int i = 0; i < values.length; i++){
            if((int)values[i] > average(values)) {
                result[currentIndex] = values[i];
                currentIndex++;
            }
        }
        return result;
    }

    public static int average(char[] array){
        int average;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    private static int calculateArraySize(char[] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if((int)values[i] > average(values)){
                size++;
            }
        }
        return size;
    }
}
