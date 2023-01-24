package com.solvd.delivery.utils.thread;

import com.solvd.delivery.Main;

import static java.lang.Thread.sleep;

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
