package com.dmdev.lesson7_arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 *
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала
 */

public class HW_task1 {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};

        System.out.println(Arrays.toString(createdArray(values)));
    }

    private static int[] createdArray(int[] values){
        int currentIndex = 0;
        int[] result = new int[calculateArraySize(values)];
        for(int i = 0; i < values.length; i++) {
            if(values[i] >= 0 ){
              result[currentIndex] = values[i] * 5;
              currentIndex++;
            }
        }
        return result;
    }

    private static int calculateArraySize(int[] values) {
        int size = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] >= 0 ){
                size++;
            }
        }
        return size;
    }
}
