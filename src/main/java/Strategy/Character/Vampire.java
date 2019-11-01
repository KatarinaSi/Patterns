package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Vampire implements FantasyCharacters {
    private Strategy strategy;

    public Vampire(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Vampire");
    }
}
