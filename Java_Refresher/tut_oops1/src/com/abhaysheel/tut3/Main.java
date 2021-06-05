package com.abhaysheel.tut3;

public class Main {
    public static void main(String[] args) {
//        Phone iPhone = new Phone();
        Phone2 samsung = new Phone2();
        Phone iPhone = new Phone("iPh 6", 5,8 ,8 ); // All private
        Phone Nexus = new Phone("N 5", 16) // using second constructor

        samsung.name = "S20";
        samsung.ram = 8;
        System.out.println(samsung.name);
        System.out.println(samsung.ram);

        iPhone.doIt("damn!!");
        iPhone.doIt("hahaha");

        iPhone.setName("Iph 6");
        System.out.println(iPhone.getName());

    }
}
