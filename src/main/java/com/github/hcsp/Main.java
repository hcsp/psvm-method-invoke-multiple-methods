package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        // invoke method a() here
        // 在这里调用方法a()
        a();
    }

    public static void a() {
        System.out.println("a");
        // invoke method b() here
        // 在这里调用方法b()
        b();
    }

    public static void b() {
        System.out.println("b");
        c();
        // invoke method c() here
        // 在这里调用方法c()
    }

    public static void c() {
        System.out.println("c");
        d();
        // invoke method d() here
        // 在这里调用方法d()
    }

    public static void d() {
        System.out.println("d");
    }
}
