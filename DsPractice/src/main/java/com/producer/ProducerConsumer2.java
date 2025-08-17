package com.producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq =  new LinkedBlockingQueue<>(3);
        Runnable r1 = () -> {
            int val = 0;
            try {
                while (true) {
                    System.out.println("producing" + val);
                    bq.put(val);
                    val++;
                    Thread.sleep(100);
                }

            } catch (Exception e){
                Thread.interrupted();
            }
        };

        Runnable r2 = () -> {
            try {
                while (true) {
                    int val = bq.take();
                    System.out.println("consumed" + val);
                    Thread.sleep(300);
                }

            } catch (Exception e){
                Thread.interrupted();
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
