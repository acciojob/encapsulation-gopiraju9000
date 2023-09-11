package com.driver;

import jdk.jshell.spi.SPIResolutionException;

public class RWOnly {

    String name;

//    private RWOnly() {
//        this.name = name;
//    }
    String getter(String name){
        return name;
    }

}
