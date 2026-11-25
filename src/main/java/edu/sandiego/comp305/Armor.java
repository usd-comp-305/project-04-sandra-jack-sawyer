package edu.sandiego.comp305;

public class Armor extends Item {
    private final int defense;

    protected Armor(String name, int defense) {
        super(name);
        this.defense = defense;
    }
}
