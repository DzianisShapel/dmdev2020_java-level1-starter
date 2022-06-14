package com.dmdev.lesson5;

public class HW_task3 {
    public static void main(String[] args) {
        int minutes = 1;
        quarter(minutes);
    }

    public static void quarter(int minutes) {
        if(minutes >= 0 && minutes <= 14) {
            System.out.println("First quarter");
        } else {
            if (minutes >= 15 && minutes <= 29) {
                System.out.println("Second quarter");
            } else {
                if (minutes >= 30 && minutes <= 44) {
                    System.out.println("Third quarter");
                }  else {
                    System.out.println("Fourth quarter");
                }
            }
        }
    }
}
