package edu.sandiego.comp305;

public class Weapon extends Item {
    private final int damage;

    public Weapon(final String name, final int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void use(final PlayableCharacter character) {
        character.equipWeapon(this);
    }
}
