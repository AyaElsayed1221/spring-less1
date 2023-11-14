package org.example;

import lombok.NoArgsConstructor;

public class Vodaphone implements Sim{

    public  Vodaphone(){
        System.out.println("Vodaphone object is created");
    }
    @Override
    public void call() {
        System.out.println("Vodaphone call executed");
    }

    @Override
    public void data() {
        System.out.println("Vodaphone data ...");
    }
}
