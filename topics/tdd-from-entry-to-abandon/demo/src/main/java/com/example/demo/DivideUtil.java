package com.example.demo;

public class DivideUtil {

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new RuntimeException();
        }
        return a / b;
    }

}
