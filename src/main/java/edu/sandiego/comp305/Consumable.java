package edu.sandiego.comp305;

public class Consumable extends Item {
    private final int healthRestore;

    private int usesRemaining;

    public Consumable(final String name, final int healthRestore, final int usesRemaining) {
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
    public void use(final PlayableCharacter character) {
        usesRemaining--;
        character.modifyHealth(healthRestore);

        if (isDepleted()) {
            character.removeItem(this);
        }
    }
}
