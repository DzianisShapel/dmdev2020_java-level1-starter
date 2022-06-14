package com.dmdev.lesson6;

public class ForExample {
    public static void main(String[] args) {
        for (int value = 10; value > 0; value--) {
            System.out.println(value);
            if (value == 5) {
                break;
            }
        }
    }


    private static void ForExample() {
        for (int value = 0; value > 10; value++) {
            System.out.println(value);
        }
    }

    private static void whileExample() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }

}
