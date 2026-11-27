package edu.sandiego.comp305;

import java.util.*;

public final class Game {
    private int progress;

    private Character player;

    private Event setting;

    private List<NPC> team;

    private Game() {
    }

    public static void main(final String[] args) {
        return;
    }

    public final Character selectCharacter(final Character character) {
        player = character;
        return player;
    }

    public final void startGame() {
        progress = 0;

        //WIP: need to fix this
        player = this.selectCharacter(this.player);
    }

    private final void reasonForGameEnd() {
        //WIP: find a system to track progress and ensure that a game only ends if necessary
    }

    public final void endGame() {
        progress = 0;
        player = null;
        setting = null;
        team = null;

        System.out.println("GAME OVER");
    }
}
