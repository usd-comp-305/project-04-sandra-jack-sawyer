package edu.sandiego.comp305;

public class Armor extends Item {
    private final int defense;

    public Armor(final String name, final int defense) {
        super(name);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public int calculateDamage(final int rawDamage) {
        return 0;
    }

    @Override
    public void use(final Character character) {

    }
}
