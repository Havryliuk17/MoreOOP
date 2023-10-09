package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3,0);
    }

    @Override
    public void kick(Character oponent){
        System.out.println("Kick");
    }
    @Override
    public String toString(){
        return "Hobbit{hp=" + this.getHp()+ ", power="+ this.getPower()+"}";
    }

}
