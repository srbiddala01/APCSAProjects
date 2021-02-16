package apcs.turtles;

import TurtleGraphics.*;

public class TurtleRunner {
    public static void main(String[] args) {
        SketchPadWindow sk = new SketchPadWindow(500,500);
        //  StandardPen pen = new StandardPen(sk);
        //  WigglePen pen = new WigglePen(sk);
        //  RainbowPen pen2 = new RainbowPen(sk);
        //  WiggleRainbowPen pen = new WiggleRainbowPen(sk);
        SlowPen pen = new SlowPen(sk);
        SlowPen.setDelay(250);
        pen.up();
        pen.move(50);
        pen.turn(90);
        pen.move(50);
        pen.down();
        for (int i = 0; i < 4; i++){
            pen.turn(90);
            pen.move(100);
        }

        SlowPen pen3 = new SlowPen(sk);
        SlowPen.setDelay(250);
        pen.up();
        for(int i = 0; i < 3; i++){
            pen3.turn(120);
            pen3.move(100);
        }

        SlowPen pen2 = new SlowPen(sk);
        SlowPen.setDelay(250);
        pen.up();
        for(int i = 0; i < 6; i++){
            pen2.turn(60);
            pen2.move(50);
        }

        SlowPen pen4 = new SlowPen(sk);
        SlowPen.setDelay(250);
        pen.up();
        for(int i = 0; i < 8; i++){
            pen4.turn(45);
            pen4.move(50);
        }
    }
}

