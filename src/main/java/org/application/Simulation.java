package org.application;

import org.application.controller.Controller;
import org.application.controller.MoveController;
import org.application.controller.ReproduceController;
import org.application.island.Island;

public class Simulation implements Runnable {

    private final Island island;

    private final Controller move;
    private final Controller reproduce;

    public Simulation(Island island) {
        this.island = island;
        move = new MoveController(island);
        reproduce = new ReproduceController(island);
    }

    @Override
    public void run() {
        move.start();
        reproduce.start();
    }
}
