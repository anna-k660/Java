package com.epam.HW5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5Task2 {
    public static int [] sortArray(int [] array){
        Arrays.sort(array);
        return array;
    }
    public static int [] getArray(int elements){
        int [] newArray = new int[elements];
        for (int number = 0; number < newArray.length; number++){
            newArray [number] = (int)(Math.random() * 100 - 40);
        }
        return newArray;
    }
    public static int [] getPositiveArray(int [] array, int num){
        int lengthArray = array.length;
        int [] newArray =  Arrays.copyOfRange(array, num, lengthArray);
        return newArray;
    }

    public static int [] getNegativeArray(int[] array, int num){
        int [] newArray =  Arrays.copyOf(array,num);
        return newArray;
    }
    public static int  countNegativeValues(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println ("Enter the number of elements in the array: ");
        Scanner scan = new Scanner(System.in);
        int numberElementsArray = scan.nextInt();

        System.out.println("\nOriginal array : ");
        int[] array = getArray(numberElementsArray);
        System.out.println(Arrays.toString(array));

        System.out.println("\nSorted array: ");
        int [] arraySorted = sortArray(array);
        System.out.println(Arrays.toString(arraySorted));

        int numberOfNegativeValues =  countNegativeValues(arraySorted);

        System.out.println("\nNegative array : ");
        int [] negative = getNegativeArray(arraySorted, numberOfNegativeValues);
        System.out.println(Arrays.toString(negative));

        System.out.println("\nPositive array : ");
        int [] positive = getPositiveArray(array, numberOfNegativeValues);
        System.out.println(Arrays.toString(positive));
    }

}
