package edu.sandiego.comp305;

public enum CharacterType {
    MAN,
    ELF,
    DWARF,
    HOBBIT,
    WIZARD,
    ORC,
    TROLL,
    NAZGUL;

    public boolean isAllyRace() {
        switch (this) {
            case MAN:
            case ELF:
            case DWARF:
            case HOBBIT:
            case WIZARD:
                return true;
            default:
                return false;
        }
    }

    public boolean isEnemyRace() {
        return !isAllyRace();
    }
}
