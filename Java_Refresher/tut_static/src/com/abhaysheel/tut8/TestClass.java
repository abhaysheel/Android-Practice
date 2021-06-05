package com.abhaysheel.tut8;

public class TestClass {
    // Static are of the object itself not of the instances of the class

    public static String name;
    public int age;
    public String color;

    public TestClass(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public static void print() {
        System.out.println("Printing...");
    }


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        TestClass.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
