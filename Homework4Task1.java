package com.epam.hw4;

import java.util.Scanner;

public class Homework4Task1 {
    public static String unique(String text){
        String unique = "";
        int amount = text.length();
        int cycle = 0;
        int firstIndex, lastIndex;
       while (cycle < amount){
           //if (text.lastIndexOf(0) == text.indexOf(0) )
           char symbol = text.charAt(cycle);
           firstIndex = text.indexOf(symbol);
           lastIndex = text.lastIndexOf(symbol);
           if (firstIndex == lastIndex) {
              unique = unique + symbol;
           }
           cycle ++;
       }
       return unique;
    }

    public static void main(String[] args){
        System.out.println ("Текст: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String uniqueSymbols = unique(text);
        System.out.println("Уникальные символы в строке: " + uniqueSymbols);
    }
}
