package com.solvd.delivery.thread;

public class M {
    public static void main2(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.start();
        b.start();
        c.start();
    }

}
