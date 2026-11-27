package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumableTest {
    private PlayableCharacter character;
    private Consumable consumable;

    @BeforeEach
    void setUp() {
        character = new PlayableCharacter("test character", 10, 0, null, null);
        consumable = new Consumable("test consumable", 5, 1);
    }

    @Test
    void testUseConsumableChangesHealthOfCharacter() {
        character.setHealth(5);
        consumable.use(character);
        assertEquals(10, character.getHealth());
    }
}