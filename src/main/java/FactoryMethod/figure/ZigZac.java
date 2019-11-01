package FactoryMethod.figure;

public class ZigZac extends Figure {

    public ZigZac(FigureType type) {
        super(type);
    }

    public void print(){
        System.out.println(type + " ZigZac");
    }
}
