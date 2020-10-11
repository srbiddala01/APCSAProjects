package apcs.gridWorld;

import info.gridworld.actor.Bug;

import java.awt.*;

public class ZBug extends Bug {
    private int steps;
    private int sideLength;
    private int segment = 0;



    public ZBug(int length) {
        sideLength = length;
        steps = 0;
        segment = 0;
    }

    public void act() {
        if (steps < sideLength && canMove()) {
            move();
            steps++;
        } else {
            if (segment == 0) {
                turn();
                turn();
                turn();
                segment++;
            } else if (segment == 1){
                turn();
                turn();
                turn();
                turn();
                turn();
                segment++;
            } else{
                return;
            }
            steps = 0;
        }
    }
}
