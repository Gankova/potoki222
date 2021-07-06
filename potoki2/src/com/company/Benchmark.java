package com.company;

import java.util.TimerTask;

public class Benchmark {
    private Runnable handler;
    private Thread t;
    private long startTime;
    public Benchmark(Runnable r){
        this.handler = r;
    }

    public long start ()throws InterruptedException{
        this.t = new Thread(this.handler);
        this.startTime = System.currentTimeMillis();// время запуска потока
        this.t.start();
        
        this.t.join();
        return System.currentTimeMillis()-this.startTime;


    }
}
