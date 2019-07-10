package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        Main x=new Main();
        x.a();
        // invoke method a() here
        // 在这里调用方法a()
    }

    public static void a() {
        Main x=new Main();
        x.b();
        // invoke method b() here
        // 在这里调用方法b()
    }

    public static void b() {
        Main x=new Main();
        x.c();
        // invoke method c() here
        // 在这里调用方法c()
    }

    public static void c() {
        Main x=new Main();
        x.d();
        // invoke method d() here
        // 在这里调用方法d()
    }

    public static void d() {
        System.out.println("d");
    }
}
