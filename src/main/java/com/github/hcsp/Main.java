package com.github.hcsp;

public class Main {
    public static void main(String[] args) {    //程序入口
        a();
    }

    public static void a() {
        System.out.println("a");
        b();
    }

    public static void b() {
        System.out.println("b");
        c();
    }

    public static void c() {
        System.out.println("c");
        d();
    }

    public static void d() {
        System.out.println("d");
    }
}
