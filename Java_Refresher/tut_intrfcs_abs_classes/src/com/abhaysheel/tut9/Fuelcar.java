package com.abhaysheel.tut9;

public class Fuelcar implements CarInterface, TestInterface{

    private String name;

    public Fuelcar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("explosion..");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " moving at "+speed);
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}
