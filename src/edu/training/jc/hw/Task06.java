package edu.training.jc.hw;
// 6. Составить программу: определения наибольшего из двух чисел а и b.

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Введите число a: ");
    int a = scanner.nextInt();
    
    System.out.print("Введите число b: ");
    int b = scanner.nextInt();
    
    if (a > b) {
    	System.out.println("Наибольшее число: " + a);
    } else if (b > a) {
    	System.out.println("Наибольшее число: " + b);
    } else {
    	System.out.println("Числа a и b равны");
    }
	
    scanner.close();
  
	}

}
