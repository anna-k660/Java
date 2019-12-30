package com.epam.lesson2;
import java.util.Scanner;
public class Homework_2_2 {
    public static void main (String[] arg){
       // System.out.println("Hello World");
        System.out.println("Программа для перевода веса из фунтов в килограммы");
        System.out.println("Введите пожалуйста вес в фунтах: " );
        Scanner sc = new Scanner(System.in);
        double funt = sc.nextDouble();
       double gramm = funt * 453.6;
         double kilo = (long) gramm / 1000;
         double gr = (long) (gramm - kilo * 1000);
        // double kilo1 = (long) kilo;

        System.out.println("Вес равен " + kilo + " килограмм " + gr +" грамм" );
    }
}
