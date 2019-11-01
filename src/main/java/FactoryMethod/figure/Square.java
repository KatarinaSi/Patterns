package FactoryMethod.figure;

public class Square extends Figure{
    public Square(FigureType type) {
        super(type);
    }

    public void print(){
        System.out.println(type + " Square");
    }
}
