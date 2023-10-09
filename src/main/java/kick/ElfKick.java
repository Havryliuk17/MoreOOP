package kick;

import lotr.Character;
import lotr.Hobbit;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getPower() < whoKick.getPower()) {
            whoIsKicked.setHp(0);
        }
        else {
            whoKick.setPower(whoKick.getPower() - 1);
        }
    }
}
