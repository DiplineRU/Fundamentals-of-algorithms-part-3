package org.example;

import java.util.Arrays;

public class SortingExample {
    public static void main(String[] args) {
        int[] arr = generateRandomArray(100000);

        long startBubbleSort = System.currentTimeMillis();
        bubbleSort(copyArray(arr));
        System.out.println("Время пузырьковой сортировки: " + (System.currentTimeMillis() - startBubbleSort) + " ms");

        long startSelectionSort = System.currentTimeMillis();
        selectionSort(copyArray(arr));
        System.out.println("Время выборочной сортировки: " + (System.currentTimeMillis() - startSelectionSort) + " ms");

        long startInsertionSort = System.currentTimeMillis();
        insertionSort(copyArray(arr));
        System.out.println("Время сортировки со вставкой: " + (System.currentTimeMillis() - startInsertionSort) + " ms");
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }

    private static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    private static void bubbleSort(int[] arr) {
        // реализация пузырьковой сортировки
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        // реализация сортировки выбором
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swapElements(arr, i, minElementIndex);
        }
    }

    private static void insertionSort(int[] arr) {
        // реализация сортировки вставкой
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
