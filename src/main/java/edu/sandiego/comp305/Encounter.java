package edu.sandiego.comp305;

public class Encounter extends Event {
    private final EventType encounter = EventType.ENCOUNTER;

    public Encounter(final EventType eventName, final Character player) {
        super(eventName);
    }
}
