package com.abhaysheel.tut9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");

        carInterface.start();
        carInterface.move(8);

        CarInterface carInterface1 = new Fuelcar("fiat");

        TestInterface testInterface = new Fuelcar("huhu");

        testInterface.printName("accent");

        carInterface1.start();
        carInterface1.move(80);
    }
}
