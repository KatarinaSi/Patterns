package AbstractFactory;

import AbstractFactory.client.DeutschClient;
import AbstractFactory.client.EnglishClient;
import AbstractFactory.client.UkrClient;

public class MovieRental {
    public static void main(String[] args) {
        new DeutschClient().getMovie().showMovie();
        new UkrClient().getMovie().showMovie();
        new EnglishClient().getMovie().showMovie();

    }
}
