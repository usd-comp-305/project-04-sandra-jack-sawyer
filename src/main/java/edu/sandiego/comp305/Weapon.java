package edu.sandiego.comp305;

public class Weapon extends Item {
    private final int damage;

    protected Weapon(String name, int damage) {
        super(name);
        this.damage = damage;
    }
}
