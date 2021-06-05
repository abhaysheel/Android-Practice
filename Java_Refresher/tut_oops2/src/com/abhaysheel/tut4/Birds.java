package com.abhaysheel.tut4;

public class Birds extends Animal {

    private int wings;
    public Birds(String name, String color, int legs, boolean tale, int wings) {
        super(name, color, legs, tale);
        this.wings = wings;
    }


    // To change the behaviour of eat method from Animal specific to Birds class
    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating finished");
    }

    public void fly(){
        System.out.println(this.getName()+ " is flying!");
    }

    public void fly(int speed){
        System.out.println(this.getName() + " flies with " + speed);
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
