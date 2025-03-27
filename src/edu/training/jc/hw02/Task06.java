package edu.training.jc.hw02;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Ошибка: нужно ввести положительное число!");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i; 
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна: " + sum);
    }
}