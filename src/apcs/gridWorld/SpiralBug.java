package apcs.gridWorld;

import info.gridworld.actor.Bug;

import java.awt.*;

public class SpiralBug extends Bug{
    private int steps;
    private int sideLength;



    public SpiralBug(int length){
        sideLength = length;
        steps = 0;
    }

    public void act () {
        if (steps < sideLength && canMove()){
            move();
            steps++;
        } else {
            turn();
            turn();
            sideLength = sideLength + 1;
            steps = 0;
        }
    }
}
