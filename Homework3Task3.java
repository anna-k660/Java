package com.epam.homework3;

public class Homework3Task3 {
    public static void main (String[] args){
        int row = 0;
        while (row <= 5){
            int space = 5;
            while (space >= row ) {
                System.out.print("  ");
                space--;
            }
            int star = 0;
            while (star <= row){
                System.out.print("* ");
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
