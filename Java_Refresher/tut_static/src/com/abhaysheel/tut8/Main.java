package com.abhaysheel.tut8;

public class Main {
    public static void main(String[] args) {
        TestClass.name = "Abhay"; // using static datatype

        TestClass testClass = new TestClass(23, "black");
        System.out.println("Name "+ testClass.getName());

        TestClass testClass1 = new TestClass(21, "white");
        System.out.println(testClass1.name);

        TestClass.print(); // Using static type function
    }
}
