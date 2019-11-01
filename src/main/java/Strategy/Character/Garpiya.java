package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Garpiya implements FantasyCharacters {
    private Strategy strategy;

    public Garpiya(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Garpiya");
    }
}
