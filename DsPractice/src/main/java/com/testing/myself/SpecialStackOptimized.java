package com.testing.myself;

import java.util.*;

class SpecialStackOptimized {
    private Stack<Long> stack = new Stack<>();
    private long currentMin;

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push((long)x);
            currentMin = x;
        } else if (x >= currentMin) {
            stack.push((long)x);
        } else {
            // store encoded value
            stack.push(2L * x - currentMin);
            currentMin = x;
        }
    }

    public int pop() {
        long top = stack.pop();
        if (top >= currentMin) {
            return (int)top;
        } else {
            int actual = (int)currentMin;
            currentMin = 2 * currentMin - top; // restore previous min
            return actual;
        }
    }

    public int top() {
        long top = stack.peek();
        if (top >= currentMin) return (int)top;
        else return (int)currentMin;
    }

    public int getMin() {
        return (int)currentMin;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // test in main
    public static void main(String[] args) {
        SpecialStackOptimized s = new SpecialStackOptimized();
        s.push(5);
        s.push(2);
        s.push(10);
        System.out.println("Min: " + s.getMin()); // 2
        System.out.println("Top: " + s.top());    // 10

        System.out.println("Pop: " + s.pop());    // 10
        System.out.println("Min: " + s.getMin()); // 2

        System.out.println("Pop: " + s.pop());    // 2
        System.out.println("Min: " + s.getMin()); // 5
    }
}
