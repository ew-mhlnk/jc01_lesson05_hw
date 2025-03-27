package edu.training.jc.hw;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите площадь первого круга: ");
        double a = scanner.nextDouble();


        System.out.print("Введите площадь второго круга: ");
        double b = scanner.nextDouble();


        if (a > b) {
            System.out.println("Площадь первого круга больше.");
        } else if (b > a) {
            System.out.println("Площадь второго круга больше.");
        } else {
            System.out.println("Площадь первого и второго кругов равны.");
        }

        scanner.close();
    }
}