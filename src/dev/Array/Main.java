package dev.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        intArray[0] = 45;
        intArray[9] = 45;

        double[] doubleArray = new double[10];
        doubleArray[2] = 3.2;
        System.out.println(doubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);

        int[] newArray;
//        newArray = new int[]{1, 2, 3, 4, 5};
        newArray = new int[5];
        for (int i=0;i<newArray.length;i++) {
            newArray[i] = newArray.length - i;
        }
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("object variable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuffer("World");
        objectArray[2] = Arrays.toString(newArray);

        System.out.println(Arrays.toString(objectArray));
    } 
}
