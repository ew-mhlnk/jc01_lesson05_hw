package edu.training.jc.hw;

import java.util.Scanner;

// 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
public class Task09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую сторону: ");
        double a = scanner.nextDouble();

        System.out.print("Введите вторую сторону: ");
        double b = scanner.nextDouble();

        System.out.print("Введите третью сторону: ");
        double c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Треугольник является равносторонним.");
        } else {
            System.out.println("Треугольник не является равносторонним.");
        }

        scanner.close();
    }
}