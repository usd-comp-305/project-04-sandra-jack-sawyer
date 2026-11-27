package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {
    private PlayableCharacter character;
    private Weapon weapon;

    @BeforeEach
    void setUp() {
        character = new PlayableCharacter("test character", 0, 0, null, null);
        weapon = new Weapon("test weapon", 10);
    }

    @Test
    void testUseEquipsWeaponToCharacter() {
        weapon.use(character);
        assertSame(weapon, character.getEquippedWeapon());
    }
}