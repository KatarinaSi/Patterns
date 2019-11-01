package FactoryMethod;

import FactoryMethod.factory.Factory;
import FactoryMethod.figure.Figure;
import FactoryMethod.figure.FigureType;

import java.util.Random;

public class GeneratorFiguries {
    public static void generate(){
        Factory factory = new Factory();
        Figure figure = factory.getFigure(rundomizerTypo(), rundomizerFigure());
        figure.print();
        Figure figure2 = factory.getFigure(rundomizerTypo(), rundomizerFigure());
        figure2.print();
        Figure figure3 = factory.getFigure(rundomizerTypo(), rundomizerFigure());
        figure3.print();
    }

    private static FigureType rundomizerTypo(){
        Random r = new Random();
        int ran = r.nextInt(2);
        FigureType []types = FigureType.values();
        return types[ran];
    }

    private static String rundomizerFigure(){
        String[] arr = {"Square", "ZigZac"};
        Random rand = new Random();
        int ran = rand.nextInt(arr.length);
        return arr[ran];
    }
}
