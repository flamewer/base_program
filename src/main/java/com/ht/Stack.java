package com.ht;

import java.util.Arrays;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack<String> stack = new java.util.Stack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}