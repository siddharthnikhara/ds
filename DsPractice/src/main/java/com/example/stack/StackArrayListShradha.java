package com.example.stack;

import java.util.ArrayList;

public class StackArrayListShradha {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int x) {
            list.add(x);
        }

        static int pop() {
            if (list.isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
    }
}
