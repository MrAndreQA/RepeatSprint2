package ru.yandex.sprint1.prakt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1};
        ArrayProcessor arrayProcessor = new ArrayProcessor(arr);


        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("Max value: " + arrayProcessor.getMaxValue());

        System.out.println("Min value: " + arrayProcessor.getMinValue());

        System.out.println("Average value: " + arrayProcessor.getAverage());

        System.out.println("Reverted array: " + Arrays.toString(arrayProcessor.revert()));

        System.out.println("Reverted array Two: " + Arrays.toString(arrayProcessor.revertTwo()));

    }
}
