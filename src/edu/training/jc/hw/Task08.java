package edu.training.jc.hw;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();

        double squareA = Math.pow(a, 2);
        double squareB = Math.pow(b, 2);

        if (squareA < squareB) {
            System.out.println("Квадрат числа a является наименьшим и равен " + squareA);
        } else if (squareB < squareA) {
            System.out.println("Квадрат числа b является наименьшим и равен " + squareB);
        } else {
            System.out.println("Квадраты чисел a и b равны: " + squareA);
        }

        scanner.close();
    }
}
