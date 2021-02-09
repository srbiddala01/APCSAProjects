package apcs.pixLab;

import java.awt.Color;

public class PixRunner {

    public static void main(String[] args) {
        Color[][] img = new Color[256][256];
        for (int r=0; r<img.length; r++) {
            for (int c=0; c<img[r].length; c++) {
                img[r][c] = new Color (255, 255, 0);
                img[r][c] = new Color (r, c, 0);
                img[r][c] = new Color (r, c, 255 - (r + c)/2);
            }
        }
        Image a = new Image(img);
        a.display("Red Image");
        a.display("Red Gradient");
        a.display("Red-Green Gradient: ");
        a.display("Full Gradient: ");

        Image b = new Image("p2p.jpg");
        b.display("Peak to Peak");

        Image c = b.copy();
        c.removeBlue();
        c.display("P2P with no blue");
    }
}

