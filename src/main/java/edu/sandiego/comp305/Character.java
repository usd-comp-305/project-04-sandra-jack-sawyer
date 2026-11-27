package edu.sandiego.comp305;

public abstract class Character {
    private final String name;

    private int health;

    private int maxHealth;

    private final int baseDamage;

    private Weapon equippedWeapon;

    private Armor equippedArmor;

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

    public Character(final String name, final int maxHealth, final int baseDamage,
                     final Weapon defaultWeapon, final Armor defaultArmor) {
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

    public void modifyHealth(final int changeInHealth) {

    }

    public void takeDamage(final int rawDamage) {

    }

    public void equipWeapon(final Weapon weapon) {

    }

    public void equipArmor(final Armor armor) {

    }

    public abstract String getAction();

}
