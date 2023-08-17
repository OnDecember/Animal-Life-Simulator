package org.application;

import org.application.controller.*;
import org.application.global.GlobalVariables;
import org.application.island.Island;

public class Simulation implements Runnable {

    private final Island island;

    private final Controller move;
    private final Controller reproduce;
    private final Controller starving;

    public Simulation(Island island) {
        this.island = island;
        move = new MoveController(island);
        reproduce = new ReproduceAnimalController(island);
        starving = new StarvingController(island);
    }

    @Override
    public void run() {
        move.start();
        reproduce.start();
        starving.start();
    }
}
