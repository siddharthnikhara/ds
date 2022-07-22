package com.example.stackPractice;

import java.util.Queue;

public class QueueReversal {

    public Queue rev(Queue q) {
        if (q.isEmpty()) {
            return q;
        }
        int data = (int) q.remove();
        q = rev(q);
        q.add(data);
        return q;
    }
}