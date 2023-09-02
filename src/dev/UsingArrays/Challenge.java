package dev.UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Challenge {
    public static void main(String[] args) {

        int[] array = gerRandomArray(3);
        System.out.println(Arrays.toString(array));
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]) {
                 temp = array[i];
                 array[i] = array[i+1];
                 array[i+1] = temp;
                 flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static int[] gerRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
