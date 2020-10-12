package apcs.gridWorld;

import info.gridworld.actor.Bug;

import java.awt.*;

public class SpiralBug extends Bug{
    private int steps;
    private int sideLengthOfSpiral;



    public SpiralBug(int length){
        sideLengthOfSpiral = length;
        steps = 0;
    }

    public void act () {
        if (steps < sideLengthOfSpiral && canMove()){
            move();
            steps++;
        } else {
            turn();
            turn();
            sideLengthOfSpiral = sideLengthOfSpiral + 1;
            steps = 0;
        }
    }
}
