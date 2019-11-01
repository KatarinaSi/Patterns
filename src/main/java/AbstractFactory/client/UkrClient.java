package AbstractFactory.client;

import AbstractFactory.factories.UkrFactory;
import AbstractFactory.Movie;

public class UkrClient implements Client {
    @Override
    public Movie getMovie() {
        return new Movie(new UkrFactory());
    }
}
