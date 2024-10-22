package com.ht;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 输入两个字符串然后倒序，最后相加
 */
public class Main {
    public static void main(String[] args) {
        int a, b;
        StringBuilder sb = new StringBuilder();
        for (int i = args[0].length()-1; i >=0; i--) {
            sb.append(args[0].charAt(i));
        }
        a = Integer.parseInt(sb.toString());
        StringBuilder sb1 = new StringBuilder();
        for (int i = args[1].length()-1; i >=0; i--) {
            sb1.append(args[1].charAt(i));
        }
        b = Integer.parseInt(sb1.toString());
        System.out.println(a+b);
    }

    private void swap( int[] arr, int i, int j )
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}