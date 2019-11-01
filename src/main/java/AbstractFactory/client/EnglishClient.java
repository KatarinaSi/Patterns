package AbstractFactory.client;

import AbstractFactory.factories.EngFactory;
import AbstractFactory.Movie;

public class EnglishClient implements Client {
    @Override
    public Movie getMovie() {
        return new Movie(new EngFactory());
    }
}
