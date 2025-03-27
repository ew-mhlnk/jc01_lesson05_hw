package edu.training.jc.hw02;

public class Task05 {
    public static void main(String[] args) {
        int i = 1;     
        int sum = 0;    
        
        while (i <= 99) {
            sum += i;  
            i += 2;   
        }
        
        System.out.println("Сумма нечётных чисел от 1 до 99: " + sum);
    }
}