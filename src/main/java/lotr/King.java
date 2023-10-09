package lotr;

import java.util.Random;

public class King extends Character{
    static Random rand = new Random();

    static int hp = rand.nextInt(11) + 5;
    static int power = rand.nextInt(11) + 5;

    public King() {
        super(hp, power);
    }

    @Override
    public void kick(Character oponent){
        System.out.println("Kick");
    }

    @Override
    public String toString(){
        return "King{hp=" + this.getHp()+ ", power="+ this.getPower()+"}";
    } 
}
