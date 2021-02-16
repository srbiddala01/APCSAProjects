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
      /*  Image a = new Image(img);
        a.display("Red Image");
        a.display("Red Gradient");
        a.display("Red-Green Gradient: ");
        a.display("Full Gradient: "); */

        Image originalCopy = new Image("p2p.jpg");
        originalCopy.display("Peak to Peak");

        Image noBlue = originalCopy.copy();
        noBlue.removeBlue();
        noBlue.display("P2P with no blue");

        Image noGreen = originalCopy.copy();
        noGreen.removeGreen();
        noGreen.display("P2P with no green");

        Image noRed = originalCopy.copy();
        noRed.removeRed();
        noRed.display("P2P with no red");

        Image blackAndWhite = originalCopy.copy();
        blackAndWhite.blackWhite();
        blackAndWhite.display("P2P in black and white");

        Image inverted = originalCopy.copy();
        inverted.invert();
        inverted.display("P2P inverted");

        Image flippedHorizontally = originalCopy.copy();
        flippedHorizontally.flipHorizontal();
        flippedHorizontally.display("P2P flipped horizontally");

        Image mirrorVertical = originalCopy.copy();
        mirrorVertical.mirrorVertical();
        mirrorVertical.display("P2P mirrored vertically");

        Image blur = originalCopy.copy();
        blur.blurImage();
        blur.display("P2P blurred");
    }
}

