package edu.sandiego.comp305;

public class Hobbit extends Character {
    private static final int MAX_HEALTH = 20;

    private static final int BASE_DAMAGE = 2;

    public Hobbit(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Dagger", BASE_DAMAGE),
                new Armor("Mithril Shirt", 4));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.HOBBIT;
    }
}
