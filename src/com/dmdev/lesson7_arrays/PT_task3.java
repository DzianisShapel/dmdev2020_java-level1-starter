package com.dmdev.lesson7_arrays;

/**
 Написать метод equals, который определяет, равны ли между собой соответствующие элементы
 2-х двумерных массивов.
 */

public class PT_task3 {
    public static void main(String[] args) {
        int[][] values1 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        int[][] values2 = {
                {1, 2, 3},
                {5, 2, 8},
                {9, 10},
        };
        System.out.println(equals(values1, values2));
    }

    public static boolean equals(int[][] values1, int[][] values2){
        if (values1.length != values2.length){
            return false;
        }
        //итерируемся по первому измерению (по строке)
        for (int i = 0; i < values1.length; i++){
            int[] row1 = values1[i];
            int[] row2 = values2[i];
            if (row1.length != row2.length){
                return false;
            }
            //итерируемся по второму измерению (по каждому столбцу)
            for (int j = 0; j < row1.length; j++){
                if(row1[j] != row2[j]){
                return false;
                }
            }
        }
        return true;
    }
}
