package edu.sandiego.comp305;

public class Dwarf extends Character {
    private static final int MAX_HEALTH = 36;

    private static final int BASE_DAMAGE = 8;

    public Dwarf(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Axe", BASE_DAMAGE),
                new Armor("Plate", 3));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.DWARF;
    }
}
