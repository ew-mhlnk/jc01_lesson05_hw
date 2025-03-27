package edu.training.jc.hw;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите число a: ");
        int a = scanner.nextInt(); // 
        
        if (a < 3) {
        	System.out.print("yes");
        } else {
        	System.out.print("no");
        }
        scanner.close();
	}

}
