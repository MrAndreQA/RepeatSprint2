package ru.yandex.sprint1.prakt;

public class ArrayProcessor {
    private int[] array;

    public ArrayProcessor(int[] array) {
        this.array = array;

    }

    public int getMaxValue() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue > max) {
                max = currentValue;
            }

        }
        return max;
    }

    public int getMaxValue1() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public int getMinValue() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public double getAverage() {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public int[] revert() {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    public int[] revertTwo() {
        int[] result = new  int[array.length];
        for (int i = array.length - 1; i >= 0 ; i--) {
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }
}



