package com.stackandqueue.SortaStackUsingRecursion;

import java.util.Stack;

public class SortStackMain {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        SortStack.sort(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}