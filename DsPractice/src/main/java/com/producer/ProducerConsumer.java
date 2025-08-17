package com.producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> pq = new LinkedBlockingQueue<>(5);
        Runnable r1 = () -> {
            int val = 0;
            try {
                while (true) {
                    System.out.println("producing " + val);
                    pq.put(val);
                    val++;
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable r2 = () -> {
            try {
                while (true) {
                    int val = pq.take();
                    System.out.println("consumed " + val);
                    Thread.sleep(300);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
