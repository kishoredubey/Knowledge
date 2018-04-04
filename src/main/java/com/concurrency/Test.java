package com.concurrency;

import java.util.concurrent.CompletableFuture;

public class Test {

    public static void main(String[] args) {

        System.out.println("Starting");
        CompletableFuture.runAsync(new MyRun());
        System.out.println("ending");
        System.out.println("Demon -> "+Thread.currentThread().getName());
        }
}

class MyRun implements Runnable {


    @Override
    public void run() {
        System.out.println("I am running");
        System.out.println("Worker -> "+Thread.currentThread().getName());
    }
}

