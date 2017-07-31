package com.devix.www;

public class Main {

    public static void main(String[] args) {
        while (true) {
            double value = Math.random();
            System.out.println(value);

            if (value >= 0.8) {
                break;
            }
        }
    }
}
