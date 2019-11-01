package AbstractFactory.client;

import AbstractFactory.factories.DeutschFactory;
import AbstractFactory.Movie;

public class DeutschClient implements Client{
    @Override
    public Movie getMovie() {
        return new Movie(new DeutschFactory());
    }
}
