package edu.sandiego.comp305;

public abstract class Item {
    private final String name;

    public Item(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use(Character character);
}
