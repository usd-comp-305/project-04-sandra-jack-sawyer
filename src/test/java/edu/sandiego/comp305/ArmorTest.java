package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmorTest {
    private PlayableCharacter character;
    private Armor armor;

    @BeforeEach
    void setUp() {
        character = new PlayableCharacter("test character", 0, 0, null, null);
        armor = new Armor("test armor", 10);
    }

    @Test
    void testUseEquipsArmorToCharacter() {
        armor.use(character);
        assertSame(armor, character.getEquippedArmor());
    }
}