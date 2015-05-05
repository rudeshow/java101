package com.hexlet.controller;

import com.hexlet.model.Player;

public class GameController {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 3;

    private static final String GAME_NAME = "XO";

    private Player[] players;

    public static String getGameName() {
        return GAME_NAME;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {

        assert x >= 0;

        if (!checkCoordinate(x) || !checkCoordinate(y)) {
            return false;
        }


       // TODO

        return true;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate > MAX_COORDINATE || coordinate < MIN_COORDINATE) {
            return false;
        } else {
            return true;
        }
    }
}
