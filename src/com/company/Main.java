package com.company;

// Напечатать в консоль элементы массива с помощью рекурсии

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        printArray(array, array.length-1);
    }

    public static void printArray(int[] array, int endArray) {
        if ( endArray >= 0 ) {
            printArray(array, endArray-1);
            System.out.println(array[endArray]);
        }
    }
}