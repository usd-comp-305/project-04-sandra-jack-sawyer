package edu.sandiego.comp305;

public enum CharacterType {
    MAN,
    ELF,
    DWARF,
    HOBBIT,
    WIZARD,
    ORC,
    TROLL,
    DRAGON,
    NAZGUL;

    public boolean isAllyRace() {
        return false;
    }

    public boolean isEnemyRace() {
        return false;
    }
}
