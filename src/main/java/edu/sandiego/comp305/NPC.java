package edu.sandiego.comp305;

public class NPC extends Character {

    public static enum Allegiance {
        ALLY,
        ENEMY,
        NEUTRAL
    }

    private final Allegiance allegiance;

    private final Item lootDrop;

    public NPC(final String name, final int maxHealth, final int baseDamage,
               final Weapon defaultWeapon, final Armor defaultArmor,
               final Allegiance allegiance, final Item lootDrop) {
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
