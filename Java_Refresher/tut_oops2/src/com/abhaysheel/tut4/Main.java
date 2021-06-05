package com.abhaysheel.tut4;

public class Main {
    public static void main(String[] args) {

        Birds pheonix = new Birds("Nina","blue",2,true, 2);
        System.out.println(pheonix.getName());
        pheonix.eat("balls");

        System.out.println(pheonix.getName());
        pheonix.fly();
        pheonix.fly(8);
    }
}
