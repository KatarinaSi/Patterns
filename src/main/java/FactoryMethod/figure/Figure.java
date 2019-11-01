package FactoryMethod.figure;

public abstract class Figure {
    protected FigureType type;

    public Figure(FigureType type) {
        this.type = type;
    }

    public abstract void print();
}
