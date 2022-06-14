package com.dmdev.task;

/**
 * Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class HW_task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 10;
        int d = 2;
        double firstArea = getArea(a,b);
        double secondArea = getArea(c,d);
        getMax(firstArea, secondArea);
    }
    /**
     * функция чтоб вычислить площади треугольников
     */
    public static double getArea(int a, int b) {
        double area = (a * b) / 2;
        return area;
    }
    /**
     * функция чтоб сравнить эти площади
     */
      public static void getMax(double firstArea, double secondArea) {
              if (firstArea > secondArea) {
                 System.out.println("The first triangle is greater than the second triangle");
              } else if (firstArea < secondArea)   {
                  System.out.println("The second triangle is greater than the first triangle");
              } else {
                  System.out.println("Triangles are equal");
              }
      }
}
