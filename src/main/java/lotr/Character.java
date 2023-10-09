package lotr;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor @Getter @Setter @ToString
public abstract class Character {
    private int hp;
    private int power;
    // private KickStrategy kickStrategy;
    public abstract void kick(Character oponent);
    
    public boolean isAlive(){
        return getHp() > 0;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
         this.hp = hp >0 ?hp :0;
    }
    
    public String ToString(){
        return this.getClass().getName()+"{hp=" + hp+ ", power="+ power+"}";
    }
}
