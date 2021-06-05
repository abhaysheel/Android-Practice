package com.abhaysheel.tut7;

public class TestClass {

    private int age;
    private String color;

    private class testInnerclass{
        private String name;

        public testInnerclass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age " + age);
        }
    }
}
