package com.epam.homework3;

public class Homework3Task1 {
    public static void main(String[] args) {
        int row = 1;
        while (row <= 5) {
            int star = 1;
            while (star < row) {
                System.out.print(" * ");
                star++;
            }
            row++;
            System.out.println();
        }
        while (row <= 10) {
            int stars = 10;
            while (stars >= row) {
                System.out.print(" * ");
                stars--;
            }
            row++;
            System.out.println();
        }

    }
}



