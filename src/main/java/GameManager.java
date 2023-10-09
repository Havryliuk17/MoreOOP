import lotr.CharacterFactory;
import lotr.Character;
import lotr.King;
import lotr.Knight;

class GameManager {
    public static void fight(Character character1, Character character2) {
        System.out.println("Let the fight begin!!!");
        System.out.println("======================");
        while (character1.getHp() > 0 && character2.getHp() > 0) {
            System.out.println("Character1 kicks");
            character1.kick(character2);
            if (character2.getHp() > 0) {
                System.out.println("Character2 kicks");
                character2.kick(character1);
            }
            if (character1.getHp() > 0 && character2.getHp() > 0) {
                System.out.println("Info about characters after kicks!");
                System.out.println(character1);
                System.out.println("======================");
                System.out.println(character2);
            }
        }
        if (character1.getHp() > 0) {
            System.out.println("Congrats to player1");
        }
        else {
            System.out.println("Congrats to player2");
        }

    }


    public static void main(String[] args) {
        King king = new King();
        Knight knight = new Knight();
        fight(king, knight);
    }
}