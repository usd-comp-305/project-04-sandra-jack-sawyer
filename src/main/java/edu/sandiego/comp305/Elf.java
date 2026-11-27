package edu.sandiego.comp305;

public class Elf extends Character {
    private static final int MAX_HEALTH = 42;

    private static final int BASE_DAMAGE = 4;

    public Elf(final String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE,
                new Weapon("Elven Bow", BASE_DAMAGE),
                new Armor("Elven Cloak", 1));
    }

    @Override
    public String getAction() {
        return "Attack";
    }

    public CharacterType getType() {
        return CharacterType.ELF;
    }
}
