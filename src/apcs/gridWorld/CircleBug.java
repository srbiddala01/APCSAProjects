package apcs.gridWorld;

import info.gridworld.actor.Bug;

import java.awt.*;

public class CircleBug extends Bug {
    private int steps;
    private int sideLength;


    public CircleBug(int length){
        sideLength = length;
        steps = 0;
    }

    public void act () {
        if (steps < sideLength && canMove()){
            move();
            steps++;
        } else {
            turn();
            steps = 0;
        }
    }
}
