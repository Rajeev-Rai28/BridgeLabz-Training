package com.stackandqueue.SortaStackUsingRecursion;

import java.util.Stack;

public class SortStack {

    // Sort the entire stack using recursion
    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Insert element in sorted position
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }
}
