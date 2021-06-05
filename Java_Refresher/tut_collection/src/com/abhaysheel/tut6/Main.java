package com.abhaysheel.tut6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Abhay", "Dfdf", "hahaha", "hshs", "huhu"};
        ArrayList<String> names = new ArrayList<>();

//        ArrayList<Integer> lol = new ArrayList<>(); // for other String data type
//        ArrayList<Boolean> lol = new ArrayList<>();
//        ArrayList<Long> lol = new ArrayList<>();
//        ArrayList<Double> lol = new ArrayList<>();


//        List<String> student = new ArrayList<>();
        names.add("Abhay");
        names.add("gugugu");

        System.out.println(names.get(0));
        System.out.println(names.size());

//        names.clear(); // to clear a array list
        names.remove("Abhay");
        System.out.println(names.size());
        System.out.println(names.get(0));

        names.add("Abhay");
        names.add("hahaha");
        names.add("gagaga");

        System.out.println(names.contains("gugugu")); // boolean output
        System.out.println("if empty - "+names.isEmpty()); // boolean output
        System.out.println(names.indexOf("gugugu"));

//        for (int i=0;i< names.size();i++){
//            System.out.println(names.get(i));
//        }

        //
        Map<String, String> contacts = new HashMap<>();


    }
}
