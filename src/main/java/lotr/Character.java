package lotr;

import kick.BasicKick;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character{

    private int hp;
    private int power;
    private BasicKick kickType;

    public void kick(Character c) {
        kickType.kick(this, c);
    }
    public void setHp(int hp) {
        if (hp >= 0)
            this.hp = hp;
        else
            this.hp = 0;
    }

    public int getPower() {
        return power;
    }

    public boolean isAlive() {
        return this.getHp() > 0;
    }

    public int getHp() {
        return hp;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + this.hp +
                ", power=" + this.power + "}";
    }

    public void setPower(int power) {
        this.power = power;
    }
}
