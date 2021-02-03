package com.company;

public class Randoms {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            System.out.println((int) (Math.random() * 1000));
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.print((int) (Math.random() * 1000) + " ");
        }
    }
}
