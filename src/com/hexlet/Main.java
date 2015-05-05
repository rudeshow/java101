package com.hexlet;

import com.hexlet.controller.GameController;
import com.hexlet.view.AdvConsoleView;
import com.hexlet.view.ConsoleView;

public class Main {
    public static void main(String[] args) {

        final GameController gameController = new GameController();
        final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
        final ConsoleView consoleView = new ConsoleView(gameController);
        startGame(advConsoleView);

    }

    private static void startGame(final ConsoleView advConsoleView) {
        advConsoleView.showGameName();
    }
}
