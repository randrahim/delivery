package com.solvd.delivery.utils.thread;

public class M extends Thread {
    public void run() {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
    public static void main2(String[] args) {
        M m = new M();
        m.start();
    }
}
