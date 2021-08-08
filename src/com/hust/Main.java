package com.hust;

import com.hust.algorithm.sort.SortAlgs;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {5, 2, 14, 6, 1, 9};
        SortAlgs sortAlgs = new SortAlgs();
        int[] result = sortAlgs.insertionSortAsc(arr);
        System.out.println("Origin:");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println("Insertion Sort");
        System.out.println("Result:");
        for (int el : result) {
            System.out.print(el+ " ");
        }
    }
}
