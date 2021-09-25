package algoritms;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 7, -1, 57, 42, 74, 55, 36};
        printArray(array);
        System.out.println("\n ==============After sorting=================");
        bubbleSort(array);
        printArray(array);
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    temp = arr[i];
                    isSorted = false;
                }
            }
        }
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.print("]");
    }
}
