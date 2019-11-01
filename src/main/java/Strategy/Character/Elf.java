package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Elf implements FantasyCharacters {
    private Strategy strategy;

    public Elf(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Elf");
    }
}
