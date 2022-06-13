package com.dmdev.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        //byte, short, int,char, String, enum
        int value = 10;
        char charValue = switch (value) {
          case 1 -> '1';
          case 2,3,4 -> '2';
          default -> '0';
        };

        switch (value) {
            case 1 -> System.out.println("value==1");
            case 2, 3, 4 -> System.out.println("value==2,3,4");
            default -> System.out.println("default value");
        }
    }
}
