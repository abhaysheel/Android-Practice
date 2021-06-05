package com.abhaysheel.tut6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();

        contacts.put("abhay", "abhay@abh.com");
        contacts.put("bhawana", "bhawana@bh.com");

        System.out.println(contacts.get("abhay"));

        System.out.println(contacts.size());

        contacts.remove("abhay");

        System.out.println(contacts.size());

        contacts.put("abhay", "abhay@abh.com");

        System.out.println(contacts.containsKey("abhay"));
        System.out.println(contacts.containsValue("abhay@abh.com"));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("hoola", 19));
        students.add(new Student("htht", 34));

        for(Student s: students){
            System.out.println(s.getName());
        }


    }
}
