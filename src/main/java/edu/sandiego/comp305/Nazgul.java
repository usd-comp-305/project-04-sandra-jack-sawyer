package edu.sandiego.comp305;

public class Nazgul extends Character {
    private static final int MAX_HEALTH = 60;

    private static final int BASE_DAMAGE = 12;

    public Nazgul(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Morgul Blade", BASE_DAMAGE),
                new Armor("Black Cloak", 2));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.NAZGUL;
    }
}
