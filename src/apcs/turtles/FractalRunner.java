package apcs.turtles;

import TurtleGraphics.SketchPadWindow;

public class FractalRunner {
    public static void main(String[] args) {
        SketchPadWindow sk = new SketchPadWindow (1000, 1000);
        SlowPen p = new SlowPen (sk);
        SlowPen.setDelay(5);
        double length  = 400;
        int degree = 6;
        p.up();
        p.move(200,0);
        p.setDirection(90);
        p.down();
        p.turn(90);
        drawKochCurve (p, length, degree);

        SketchPadWindow sk2 = new SketchPadWindow (1000, 1000);
        SlowPen p2 = new SlowPen (sk2);
        SlowPen.setDelay(5);
        double length2  = 1000;
        int degree2 = 4;
        p2.up();
        p2.move(50,0);
        p2.setDirection(90);
        p2.down();
        p2.turn(315);
        drawCCurve (p2, length2, degree2);
    }

    public static void drawKochCurve(SlowPen p, double length, int degree){
        if (degree == 0){
            p.move(length);
        } else if (degree > 0){
            // p.move(length/3);
            drawKochCurve(p, length/3, degree - 1);
            p.turn(-60);
            //p.move(length/3);
            drawKochCurve(p, length/3, degree - 1);
            p.turn(120);
           // p.move(length/3);
            drawKochCurve(p, length/3, degree - 1);
            p.turn(-60);
           // p.move(length/3);
            drawKochCurve(p, length/3, degree - 1);
        }
    }
    public static void drawCCurve (SlowPen p, double length, int degree){
        if (degree == 0){
            p.move(length);
        } else if (degree > 0){
            p.turn(135);
            drawCCurve(p, length/2, degree - 1);
            p.turn(90);
            drawCCurve(p, length/2, degree - 1);
            p.turn(135);
        }
    }
}
