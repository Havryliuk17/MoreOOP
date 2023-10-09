package lotr;

import kick.BasicKick;
import kick.NobleKick;

import java.util.Random;

public class Noble extends Character {
    private final static Random randomGenerator = new Random();

    public Noble(int min, int max) {
        super(randomGenerator.nextInt(max - min + 1) + min,
                 randomGenerator.nextInt(max - min + 1) + min, new NobleKick());
    }

}
