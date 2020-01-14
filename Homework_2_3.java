package com.epam.lesson2;
import java.util.Scanner;
public class Homework_2_3 {
    public static void main (String[] arg){
        System.out.println("Программа для расчета суммы прибыли по депозиту");
        System.out.println("Введите сумму депозита, грн ");
        Scanner scan1 = new Scanner(System.in);
        double deposit = scan1.nextDouble();
        System.out.println("Введите количество месяцев для депозита");
        Scanner scan2 = new Scanner(System.in);
        int month = scan2.nextInt();
        System.out.println("Введите годовую процентную ставку");
        Scanner scan3 = new Scanner(System.in);
        double percentPerYear = scan3.nextDouble();
        double profit = (deposit * (percentPerYear / 100) / 365) * month * 30;
        System.out.println("Сумма прибыли по заданному депозиту составляет: " + profit + "грн");
    }
}
