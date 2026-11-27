package edu.sandiego.comp305;

public abstract class Character {
    private final String name;

    private int health;

    private int maxHealth;

    private final int baseDamage;

    private Weapon equippedWeapon;

    private Armor equippedArmor;

    public Character(final String name, final int maxHealth, final int baseDamage,
                     final Weapon defaultWeapon, final Armor defaultArmor) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.baseDamage = baseDamage;
        this.equippedWeapon = defaultWeapon;
        this.equippedArmor = defaultArmor;
    }

    public abstract String getAction();

    public boolean isAlive() {
        return false;
    }

    public void modifyHealth(final int changeInHealth) {
        health += changeInHealth;
    }

    public void takeDamage(final int rawDamage) {

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }
}
