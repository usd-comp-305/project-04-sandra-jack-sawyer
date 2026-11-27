package edu.sandiego.comp305;

import java.util.List;

public class PlayableCharacter extends Character {
    private List<Item> inventory;

    private List<NPC> companions;

    public PlayableCharacter(final String name, final int maxHealth, final int baseDamage,
                             final Weapon defaultWeapon, final Armor defaultArmor) {
        super(name, maxHealth, baseDamage, defaultWeapon, defaultArmor);
    }

    public void addItem(final Item item) {

    }

    public void removeItem(final Item item) {

    }

    public boolean hasItem(final String itemName) {
        return false;
    }

    public void useItem(final int index) {

    }

    public void addCompanion(final NPC ally) {

    }

    @Override
    public String getAction() {
        return "";
    }
}
