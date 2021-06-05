package com.abhay.tut1;

import java.util.Random;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
//        System.out.println("Abhay");
        // how to take a input
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int x = input.nextInt();

        // random number
        Random rand = new Random();
        int r = rand.nextInt(30) + 25;
        System.out.println("Hello! " + name + " " + r);
    }
}
