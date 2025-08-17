package com.deadlock;

public class Deadlock {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Runnable r1 = () -> {
            while (true) {
                try {
                    synchronized (obj1) {
                        System.out.println("thread 1 accuired lock on obj1");
                        Thread.sleep(100);
                    }
                } catch (Exception e) {

                }
                try {
                    synchronized (obj2) {
                        System.out.println("thread 1 accuired lock on obj2");
                    }
                } catch (Exception e) {

                }
            }
        };

        Runnable r2 = () -> {
            while (true) {
                try {
                    synchronized (obj2) {
                        System.out.println("thread 2 accuired lock on obj2");
                        Thread.sleep(100);
                    }
                } catch (Exception e) {

                }
                try {
                    synchronized (obj1) {
                        System.out.println("thread 2 accuired lock on obj1");
                    }
                } catch (Exception e) {

                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
