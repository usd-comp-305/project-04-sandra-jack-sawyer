package edu.sandiego.comp305;

public class Man extends Character {
    private static final int MAX_HEALTH = 33;

    private static final int BASE_DAMAGE = 5;

    public Man(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Sword", BASE_DAMAGE),
                new Armor("Chainmail", 2));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.MAN;
    }
}
