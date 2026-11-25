package edu.sandiego.comp305;

public abstract class Event {
    private final EventType eventName;

    public Event(EventType eventName) {
        this.eventName = eventName;
    }

    public final EventType getEventName() {
        return eventName;
    }

    public final void runEvent() {
        return;
    }

}
