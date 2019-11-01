package FactoryMethod.factory;

import FactoryMethod.figure.Figure;
import FactoryMethod.figure.FigureType;
import FactoryMethod.figure.Square;
import FactoryMethod.figure.ZigZac;

public class Factory {
    public Figure getFigure(FigureType type, String figure){
        if(figure.equalsIgnoreCase("ZigZac")){
            return new ZigZac(type);
        } else if(figure.equalsIgnoreCase("Square")){
            return new Square(type);
        }
        return null;
    }
}
