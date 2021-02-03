package com.company;

public class Password {
    public static void main(String[] args) {
        String password = "qwerty12";
        String passFromConsole = args[0];
        
        System.out.println(passFromConsole.equals(password));
    }
}
