package com.epam.HW5;
import java.util.Arrays;
import java.util.Scanner;

public class Homework5Task1 {
    public static int[] getArray(int elements) {
        int[] array = new int[elements];
        for (int num = 0; num < array.length; num++) {
            array[num] = (int) (Math.random() * 100 - 40);
        }
        return array;
    }

    public static int[] sumArrays(int[] array1, int[] array2) {
        int [] arraySum = new int[array1.length];
        for (int num = 0; num < array1.length; num++) {
            arraySum[num] = array1[num] + array2[num];
        }
        return arraySum;
    }

    public static void main(String[] args){
        System.out.println ("Enter the number of elements in the array: ");
        Scanner scan = new Scanner(System.in);
        int numberElementsArray = scan.nextInt();

        System.out.println("\nFirst array: ");
        int [] array1 = getArray(numberElementsArray);
        System.out.print(Arrays.toString(array1));

        System.out.println("\nSecond array: ");
        int [] array2 = getArray(numberElementsArray);
        System.out.print(Arrays.toString(array2));

        System.out.println("\n Amount array1 + array2");
        int [] arraysSum = sumArrays(array1,array2);
        System.out.print(Arrays.toString(arraysSum));
    }
}


