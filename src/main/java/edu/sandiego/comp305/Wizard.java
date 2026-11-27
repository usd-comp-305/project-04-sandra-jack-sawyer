package edu.sandiego.comp305;

public class Wizard extends Character {
    private static final int MAX_HEALTH = 15;

    private static final int BASE_DAMAGE = 4;

    public Wizard(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Staff", BASE_DAMAGE),
                new Armor("Robes", 1));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.WIZARD;
    }
}
