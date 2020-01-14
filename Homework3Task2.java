package com.epam.homework3;

public class Homework3Task2 {
    public static void main(String[] args){
        int row = 0;
        while (row <= 5){
            int space = 0;
            while (space < row ) {
                System.out.print("  ");
                space++;
            }
            int star = 5;
            while (star >= row){
                System.out.print("* ");
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
