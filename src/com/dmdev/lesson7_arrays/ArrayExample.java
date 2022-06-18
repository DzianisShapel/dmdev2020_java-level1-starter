package com.dmdev.lesson7_arrays;

public class ArrayExample {
    public static void main(String[] args) {
       //создаем новый массив типа int и размера 10
        int[] values = new int[10];

        values[4] = 9;
        values[7] = 98;

        for (int i = 0; i < values.length; i++){
            System.out.println(i + ": " + values[i]);
        }
    }

    private static void test() {
        int value = 10;
        //индексы        0  1  2  3  4
        int[] values =  {1, 5, 6, 8, 9};  //означает множество элементов одного типа
        System.out.println(values[2]);

        values[3]=18;
        System.out.println(values[3]);
    }
}


