package org.example;

public class Main {
    static private Inter extend;
    public static void main(String[] args) {
        extend = new Extend1();
        source(args[0]);
    }

    private static void source(String arg) {
        extend.do_sink(arg);
    }
}