package com.sabari.designPattern.factorypattern;

import com.sabari.designPattern.abstractfactorypattern.Circle;
import com.sabari.designPattern.abstractfactorypattern.Rectangle;
import com.sabari.designPattern.abstractfactorypattern.Shape;
import com.sabari.designPattern.abstractfactorypattern.Square;

public class ShapeFactory {

  //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
    if(shapeType == null){
    return null;
    }
    if(shapeType.equalsIgnoreCase("CIRCLE")){
    return new Circle();
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
    return new Rectangle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
    return new Square();
    }
    return null;
    }
}
