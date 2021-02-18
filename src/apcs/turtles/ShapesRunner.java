package apcs.turtles;

import TurtleGraphics.SketchPadWindow; 

public class ShapesRunner {
    public static void main (String [] args) {
        SketchPadWindow sk = new SketchPadWindow (700, 700);
        SlowPen p = new SlowPen (sk);
        SlowPen.setDelay(10);
        p.up();
        p.move(150,0);
        p.setDirection(90);
        p.down();
        spiral (p, 150, 45);

        SketchPadWindow sk2 = new SketchPadWindow (1500, 500);
        SlowPen p2 = new SlowPen (sk2);
        SlowPen.setDelay(10);
        p2.up();
        p2.move(150,0);
        p2.setDirection(90);
        p2.down();
        zigZag (p2, 150);
    }
    public static void spiral(SlowPen p, int dist, int angle) {
        if (dist > 0) {
            p.move(dist);
            p.turn(angle);
            spiral(p, dist - 1, angle + 1);
        }
    }
    public static void zigZag(SlowPen p, int distance){
        if (distance > 0){
            p.move(distance);
            if (distance % 2 == 0){
                p.turn(-175);
            } else {
                p.turn(175);
            }
        }
        zigZag(p, distance - 1);
    }
}


