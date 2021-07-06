package com.company;

public class Main2 {
    public static void main(String[] args){
        Benchmark b = new Benchmark(() ->sleep(1250,new Object()));
        Benchmark b1 = new Benchmark(() ->sleep(1300, new Object()));
        Benchmark b2 = new Benchmark(() ->sleep(90, new Object()));


        try {
            System.out.println("b: " + b.start());
            System.out.println("b1: " + b1.start());
            System.out.println("b2: " + b2.start());
        } catch (InterruptedException e){}

    }
    public static void sleep(long m, Object o){
        try {
            synchronized (o) {
                o.wait(m);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
