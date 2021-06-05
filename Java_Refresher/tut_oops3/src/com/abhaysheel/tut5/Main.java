package com.abhaysheel.tut5;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {


//        Engine engine = new Engine("fiat", 7000)
//        Car accent = new Car("gle", 4, "white")
                        // OR
//        Car accent = new Car("gle",4, "white", new Engine("fiat",7000));


//
//        System.out.println(accent.getName());
//        System.out.println(accent.getEngine().getModel())
//
//        Engine engine = accent.getEngine()
//        System.out.println(accent.getEngine().getModel());



//        Car tiago = null;
//
//        if (tiago!=null){
//            tiago.getName();
//        }else{
//            System.out.println("This car was null");
//        }

        final int a = 6; // this variable value cannot be changed

        final Engine engine = new Engine("fiat",7000);
//        engine = new Engine("fiat",2000); // this cannot be done now
        //  BUT
        // properties can be changes
        engine.setRpm(10000);
        engine.setModel("maruti");

        System.out.println(engine.getModel());

    }
}
