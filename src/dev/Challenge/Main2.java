package dev.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        int[] arr = readIntegers();
        System.out.println(Arrays.toString(arr));

        reverse(arr);

    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by space");
        String input = scanner.nextLine();

        String[] splits = input.split(" ");
        int[] value = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            value[i] = Integer.parseInt(splits[i]);
        }
        return value;
    }

    private static void reverse (int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for ( int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
