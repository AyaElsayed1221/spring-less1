package org.example;

public class Airtel implements Sim{

    public Airtel(){
        System.out.println("Airten instance is created");
    }
    @Override
    public void call() {
        System.out.println("Airtel call executed");
    }

    @Override
    public void data() {
        System.out.println("Airtel Data ...");
    }
}
