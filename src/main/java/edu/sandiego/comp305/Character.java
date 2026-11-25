package edu.sandiego.comp305;

public abstract class Character {
    private final String name;
    private int health;
    private int maxHealth;
    private final int baseDamage;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Character(String name, int maxHealth, int baseDamage, Weapon defaultWeapon, Armor defaultArmor) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.baseDamage = baseDamage;
        this.equippedWeapon = defaultWeapon;
        this.equippedArmor = defaultArmor;
    }

    public boolean isAlive() {
        return false;
    }

    public void modifyHealth(int changeInHealth) {

    }

    public void takeDamage(int rawDamage) {

    }

    public void equipWeapon(Weapon weapon) {

    }

    public void equipArmor(Armor armor) {

    }

    public abstract String getAction();

}
