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

    private static void bubbleSort(int[] arr) {
        // реализация пузырьковой сортировки
    }

    private static void selectionSort(int[] arr) {
        // реализация сортировки выбором
    }

    private static void insertionSort(int[] arr) {
        // реализация сортировки вставкой
    }
}
