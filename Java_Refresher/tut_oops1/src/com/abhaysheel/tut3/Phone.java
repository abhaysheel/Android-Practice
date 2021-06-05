package com.abhaysheel.tut3;

public class Phone {
    private String name;
    private int size;
    private int ram;
    private int cam;

    public Phone(String name, int size, int ram, int cam) {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.cam = cam;
    }

    // Second constructor
    public Phone(String name, int ram) {
        this.name = name;
        this.ram = ram;
    }

    public void doIt (String x){
        System.out.println("Playing " + x);
    }

    // how to get access to private
    public void setName (String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

  // Right click -> Generate -> Getters and Setters
    public int getCam() {
        return cam;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    // Getter and setter END

}
