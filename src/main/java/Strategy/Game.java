package Strategy;

import Strategy.Character.*;
import Strategy.Strategy.*;

public class Game {
    public static void main(String[] args) {
        Strategy flyStrategy = new FlyStrategy();
        Strategy magicStrategy = new MagicStrategy();
        Strategy superStrategy = new SuperStrategy();
        Strategy walkStrategy = new WalkStrategy();

        new Troll(walkStrategy).executeStrategy();
        new Pegas(superStrategy).executeStrategy();
        new Vampire(magicStrategy).executeStrategy();
        new Elf(magicStrategy).executeStrategy();
        new Garpiya(flyStrategy).executeStrategy();
        new Ork(walkStrategy).executeStrategy();
    }
}
