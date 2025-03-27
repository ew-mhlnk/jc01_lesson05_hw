package edu.training.jc.hw;

import java.util.Scanner;

// 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
public class Task07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число a: ");
        double a = scanner.nextDouble(); 

        System.out.print("Введите число b: ");
        double b = scanner.nextDouble(); 

        System.out.print("Введите число c: ");
        double c = scanner.nextDouble();

        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();

        double expressionValue = (a * x * x) + (b * x) + c;
        double modulus = Math.abs(expressionValue);

        System.out.println("Модуль выражения равен: " + modulus);

        scanner.close();
    }
}