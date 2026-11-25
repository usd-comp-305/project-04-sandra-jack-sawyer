package edu.sandiego.comp305;

public class Armor extends Item {
    private final int defense;

    public Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public int calculateDamage(int rawDamage) {
        return 0;
    }

    @Override
    public void use(Character character) {

    }
}
