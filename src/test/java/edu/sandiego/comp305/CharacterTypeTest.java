package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CharacterTypeTest {

    @Test
    void containsAllDesignedRaces() {
        final CharacterType[] expected = {
            CharacterType.MAN,
            CharacterType.ELF,
            CharacterType.DWARF,
            CharacterType.HOBBIT,
            CharacterType.WIZARD,
            CharacterType.ORC,
            CharacterType.TROLL,
            CharacterType.NAZGUL
        };
        assertEquals(expected.length, CharacterType.values().length);
        for (final CharacterType type : expected) {
            assertEquals(type, CharacterType.valueOf(type.name()));
        }
    }

    @Test
    void allyRacesAreNotEnemyRaces() {
        for (final CharacterType type : CharacterType.values()) {
            if (type.isAllyRace()) {
                assertFalse(
                        type.isEnemyRace(),
                        type + " should not be both ally and enemy");
            } else {
                assertTrue(type.isEnemyRace(), type + " should be enemy");
            }
        }
    }

    @Test
    void freePeoplesAreAllies() {
        assertTrue(CharacterType.MAN.isAllyRace());
        assertTrue(CharacterType.ELF.isAllyRace());
        assertTrue(CharacterType.DWARF.isAllyRace());
        assertTrue(CharacterType.HOBBIT.isAllyRace());
        assertTrue(CharacterType.WIZARD.isAllyRace());
    }

    @Test
    void shadowForcesAreEnemies() {
        assertTrue(CharacterType.ORC.isEnemyRace());
        assertTrue(CharacterType.TROLL.isEnemyRace());
        assertTrue(CharacterType.NAZGUL.isEnemyRace());
    }
}
