package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {
    public ArrayList<Game> installedGames;
    private PowerSupply powerSupply;

    public Computer(PowerSupply ps) {
        this.powerSupply = ps;
        this.installedGames = new ArrayList<>();
    }

    public Computer(PowerSupply ps, ArrayList<Game> preInstalled) {
        this(ps);
        this.installedGames.addAll(preInstalled);
    }

    public void turnOn() {
        this.powerSupply.turnOn();
    }

    public void installGame(Game game) {
        this.installedGames.add(game);
    }

    public String playGame(Game game) {
        for (Game g : this.installedGames) {
            if (g.equals(game)) {
                return g.start();
            }
        }
        return "Game not installed";
    }
}
