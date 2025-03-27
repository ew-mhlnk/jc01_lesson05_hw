package edu.training.jc.hw;

import java.util.Scanner;

// 4. Составить программу: равны ли два числа а и b?
public class Task04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Числа a и b равны");
        } else {
            System.out.println("Числа a и b НЕ равны");
        }

        // Закрываем Scanner
        scanner.close();
    }
}