package com.driver;

public class Main {
    public static void main(String[] args) {
        String s = "raju";
//        RWOnly obj = new RWOnly(s);
         // Error

        RWOnly obj = new RWOnly();

        String ans = obj.getter(s);


    }
  
}