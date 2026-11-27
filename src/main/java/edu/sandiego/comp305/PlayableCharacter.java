package edu.sandiego.comp305;

import java.util.List;

public class PlayableCharacter extends Character {
    private List<Item> inventory;
    private List<NPC> companions;

    public PlayableCharacter(String name, int maxHealth, int baseDamage, Weapon defaultWeapon, Armor defaultArmor) {
        super(name, maxHealth, baseDamage, defaultWeapon, defaultArmor);
    }

    public void addItem(Item item) {

    }

    public boolean hasItem(String itemName) {
        return false;
    }

    public void useItem(int index) {

    }

    public void addCompanion(NPC ally) {

    }

    @Override
    public String getAction() {
        return "";
    }
}
