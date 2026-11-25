package edu.sandiego.comp305;

public final class Battle extends Event {
    private final EventType battle = EventType.BATTLE;

    public Battle(final EventType eventName, final Character player) {
        super(eventName);
    }
}
