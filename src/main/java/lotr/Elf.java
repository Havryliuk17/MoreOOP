package lotr;
// import KickStrategy;

public class Elf extends Character {

    public Elf() {
        super(10,10);
    }

    @Override
    public void kick(Character oponent){
        if (this.getPower() < oponent.getPower()){
            this.setPower(this.getPower()-1);
        }
        if (this.getPower() > oponent.getPower()) {
            oponent.setHp(0);
        }
    }

    @Override
    public String toString(){
        return "Elf{hp=" + this.getHp()+ ", power="+ this.getPower()+"}";
    }

}
