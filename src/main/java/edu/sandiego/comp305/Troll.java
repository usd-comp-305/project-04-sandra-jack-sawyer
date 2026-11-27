package edu.sandiego.comp305;

public class Troll extends Character {
    private static final int MAX_HEALTH = 50;

    private static final int BASE_DAMAGE = 16;

    public Troll(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Club", BASE_DAMAGE),
                new Armor("Thick Hide", 4));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.TROLL;
    }
}
