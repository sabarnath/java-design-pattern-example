package com.sabari.designPattern.abstractfactorypattern;

public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
