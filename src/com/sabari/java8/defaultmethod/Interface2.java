package com.sabari.java8.defaultmethod;

@FunctionalInterface
public interface Interface2 {

    void message(String msg);
    
    default void log(String log){
        System.out.println("Print log from I2"+log);
    }
}
