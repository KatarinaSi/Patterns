package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Pegas implements FantasyCharacters {
    private Strategy strategy;

    public Pegas(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Pegas");
    }
}
