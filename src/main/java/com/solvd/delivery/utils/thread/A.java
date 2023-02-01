package com.solvd.delivery.utils.thread;

import com.solvd.delivery.Main;

public class A extends Main {
    @Override
    public void start() {
        try {
            sleep(300);
            System.out.println("A");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
