package com.epam.lesson2;
import java.util.Scanner;
public class Homework_2_1 {
    public static void main(String[] arg){
        System.out.println("Введите любое трехзначное целое число");
        Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();

      int num4 = (num % 10 * 100) + (num % 100 - num % 10) + (num - num % 10- (num % 100 - num % 10)) / 100;
      
        System.out.println("Число в обратном порядке: " + num4);
        System.out.println("Разница между числами: " + (num - num4));

    }
}
