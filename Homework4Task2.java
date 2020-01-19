package com.epam.hw4;

import java.util.Scanner;

public class Homework4Task2 {
    public static String binar(int number) {
        int modul;
        String numberBinar = "";
        while (number != 0) {
            modul = number % 2;
            numberBinar = modul + numberBinar;
            number = number / 2;
        }
        return numberBinar;
    };

    public static void main(String[] args) {
        System.out.println ("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String binarNumber = binar(number);
        System.out.print("Число в двоичном представлении: " + binarNumber);

    }
}
