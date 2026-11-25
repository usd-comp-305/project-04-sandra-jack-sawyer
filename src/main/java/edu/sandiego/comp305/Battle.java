package edu.sandiego.comp305;

public final class Battle extends Event {
    private final EventType battle = EventType.BATTLE;

    public Battle(EventType eventName, Character player) {
        super(eventName);
    }
}
