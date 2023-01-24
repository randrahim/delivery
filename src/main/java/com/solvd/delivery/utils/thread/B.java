package com.solvd.delivery.utils.thread;

import com.solvd.delivery.Main;

public class B extends Main {
    @Override
    public void start() {
        try {
            sleep(500);
            System.out.println("B");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
