package com.abhaysheel.tut4;

public class Dog {
    private String name;
    private String color;
    private int legs;
    private  boolean tale;

    public Dog(String name, String color, int legs, boolean tale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.tale = tale;
    }

    public void eat(String food){
        System.out.println("Eating "+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }
}
