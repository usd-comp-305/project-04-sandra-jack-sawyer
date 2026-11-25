package edu.sandiego.comp305;

public class Consumable extends Item {
    private final int healthRestore;
    private final int usesRemaining;

    public Consumable(String name, int healthRestore, int usesRemaining) {
        super(name);
        this.healthRestore = healthRestore;
        this.usesRemaining = usesRemaining;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

    public int getUsesRemaining() {
        return usesRemaining;
    }

    public boolean isDepleted() {
        return false;
    }

    @Override
    public void use(Character character) {

    }
}
