package com.dmdev.lesson7_arrays;

/**
 * Написать программу, заносящую в массив первые 100 целых чисел,
 * делящихся на 13 или на 17, и печатающую его.
 */

public class PT_task2 {
    public static void main(String[] args) {
        int[] values = new int[100];
        fillArray(values);
        PT_task1.printArray(values);
    }

    public static void fillArray(int[] values){
        int currentIndex = 0;
        for(int currentValue = 1; currentIndex < values.length; currentValue++) {
                if(currentValue % 13 == 0 || currentValue % 17 == 0){
                    values[currentIndex] = currentValue;
                    currentIndex++;
                }
        }
    }
}
