package com.hexlet.view;

import com.hexlet.controller.GameController;

public class ConsoleView {

    protected final GameController gameController;

    public ConsoleView(final GameController gameController) {
        this.gameController = gameController;
    }

    public void showGameName() {
        System.out.println(gameController.getGameName());
    }

    public void showPlayersName() {
        System.out.println(gameController.getPlayers());
    }
}
