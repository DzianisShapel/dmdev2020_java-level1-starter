package com.dmdev.task;

/*
1. Дан порядковый номер месяца. Вывести в консоль пору года к которой относится месяц
winter 12 1 2
spring 3 4 5
summer 6 7 8
autumn 9 10 11
 */

public class Task1 {
    public static void main(String[] args) {
        int month = 1;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrect month");
        }
    }
}


