package edu.sandiego.comp305;

public class NPC extends Character {

    public enum Allegiance {
        ALLY,
        ENEMY,
        NEUTRAL
    }

    private final Allegiance allegiance;
    private final Item lootDrop;

    public NPC(String name, int maxHealth, int baseDamage, Weapon defaultWeapon,
               Armor defaultArmor, Allegiance allegiance, Item lootDrop) {
        super(name, maxHealth, baseDamage, defaultWeapon, defaultArmor);
        this.allegiance = allegiance;
        this.lootDrop = lootDrop;
    }

    public Allegiance getAllegiance() {
        return this.allegiance;
    }

    public boolean isHostile() {
        return false;
    }

    public Item dropLoot() {
        return null;
    }

    @Override
    public String getAction() {
        return "";
    }
}
