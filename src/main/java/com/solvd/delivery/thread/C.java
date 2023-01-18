package com.solvd.delivery.thread;

import com.solvd.delivery.Main;

public class C extends Main {
    @Override
    public void start() {
        try {
            sleep(100);
            System.out.println("C");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
