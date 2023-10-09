package lotr;

import java.util.Random;

public class Knight extends Character {
    static Random rand = new Random();

    static int hp = rand.nextInt(11) + 2;
    static int power = rand.nextInt(11) + 2;

    public Knight() {
        super(hp, power);
    }

    @Override
    public void kick(Character oponent){
        System.out.println("Kick");
    }

    @Override
    public String toString(){
        return "Knight{hp=" + this.getHp()+ ", power="+ this.getPower()+"}";
    } 
}
