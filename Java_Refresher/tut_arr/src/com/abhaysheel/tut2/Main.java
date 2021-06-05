package com.abhaysheel.tut2;

public class Main {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "lolol";
        s[1] = "jhh";
        // go on like this
        // OR

        String[] name = {"lolol", "ghghgh", "klklkl", "lolol"};
        int[] num = new int[3];

        int[] num2 = {1,2,3,4,4,5};

        // For unknown length of array -> num.length, num2.length, name.length

        System.out.println(name[1]);
        System.out.println(num[0]);
        System.out.println(name.length);

        if (name[0].equals(name[3])){
            System.out.println("True");
        }

    }
}
