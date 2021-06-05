package com.abhaysheel.tut4;

public class Animal {
    private String name;
    private String color;
    private int legs;
    private  boolean tale;

    public Animal(String name, String color, int legs, boolean tale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.tale = tale;
    }

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void eat (String food){
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
