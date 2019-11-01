package Strategy.Character;

import Strategy.Strategy.Strategy;

public class Ork implements FantasyCharacters {
    private Strategy strategy;

   public Ork(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void executeStrategy() {
        System.out.println(strategy.action() + " Ork");
    }
}
