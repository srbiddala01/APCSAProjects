package apcs.gridWorld;

import info.gridworld.actor.Bug;

import java.awt.*;

public class CircleBug extends Bug {
    private int steps;
    private int sideLengthOfCircle;


    public CircleBug(int length){
        sideLengthOfCircle = length;
        steps = 0;
    }

    public void act () {
        if (steps < sideLengthOfCircle && canMove()){
            move();
            steps++;
        } else {
            turn();
            steps = 0;
        }
    }
}
