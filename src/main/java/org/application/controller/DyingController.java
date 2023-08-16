package org.application.controller;

import org.application.global.GlobalVariables;
import org.application.island.Island;
import org.application.island.Location;

public class DyingController extends Controller {

    public DyingController(Island island) {
        super(island);
    }

    @Override
    protected void doAction(Location location) {
        location.getSetOrganismsOnLocation()
                .stream()
                .filter(organism -> !organism.isAlive())
                .forEach(location::removeOrganism);
    }
}
