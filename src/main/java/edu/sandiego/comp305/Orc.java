package edu.sandiego.comp305;

public class Orc extends Character {
    private static final int MAX_HEALTH = 10;

    private static final int BASE_DAMAGE = 6;

    public Orc(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Scimitar", BASE_DAMAGE),
                new Armor("Hide", 1));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.ORC;
    }
}
