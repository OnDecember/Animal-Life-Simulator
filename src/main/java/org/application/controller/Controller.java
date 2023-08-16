package org.application.controller;

import org.application.config.database.DataBase;
import org.application.island.Island;
import org.application.island.Location;

import java.util.Arrays;

public abstract class Controller {

    protected final DataBase dataBase = DataBase.getInstance();
    protected final Island island;
    protected final Location[][] locations;

    public Controller(Island island) {
        this.island = island;
        this.locations = island.getLocations();
    }

    protected abstract void doAction(Location location);

    public void start() {
        Arrays.stream(locations)
                .flatMap(Arrays::stream)
                .forEach(this::doAction);
    }
}