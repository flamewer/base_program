package com.ht;

import java.util.Arrays;
import java.util.Stack;

/**
 * 冒泡排序算法
 */
public class Sort {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 5, 2, 1 };
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    Sort.swap( arr, i, j);
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}