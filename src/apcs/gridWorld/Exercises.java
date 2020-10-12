package apcs.gridWorld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;

public class Exercises {
    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(50, 50);
        ActorWorld world = new ActorWorld(grid);

        Location circlebugloc = new Location (10, 5);
        CircleBug circlebug = new CircleBug(4);
        circlebug.setColor(Color.CYAN);
        world.add(circlebugloc, circlebug);

        Location spiralbugloc = new Location (30, 12);
        SpiralBug spiralbug = new SpiralBug(2);
        spiralbug.setColor(Color.orange);
        world.add(spiralbugloc, spiralbug);

        Location zbugloc = new Location (20, 30);
        ZBug zbug = new ZBug(4);
        zbug.setColor(Color.green);
        zbug.setDirection(90);
        world.add(zbugloc, zbug);



        world.show();
    }
}
