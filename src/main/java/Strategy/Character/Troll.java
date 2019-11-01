package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Troll implements FantasyCharacters {
    private Strategy strategy;

    public Troll(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Troll");
    }
}
