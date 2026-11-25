package edu.sandiego.comp305;

public class Consumable extends Item {
    private final int healthRestore;
    private final int usesRemaining;

    protected Consumable(String name, int healthRestore, int usesRemaining) {
        super(name);
        this.healthRestore = healthRestore;
        this.usesRemaining = usesRemaining;
    }
}
