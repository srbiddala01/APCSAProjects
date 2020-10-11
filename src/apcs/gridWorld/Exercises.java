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

       CircleBug circlebug = new CircleBug(4);
       circlebug.setColor(Color.CYAN);
        world.add(circlebug);

        SpiralBug spiralbug = new SpiralBug(2);
        spiralbug.setColor(Color.orange);
        world.add(spiralbug);

        ZBug zbug = new ZBug(4);
        zbug.setColor(Color.green);
        zbug.setDirection(90);
        world.add(zbug);



        world.show();
    }
}
