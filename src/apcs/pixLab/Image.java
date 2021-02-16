package apcs.pixLab;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
    /*
     * Instance variables: image - a 2D Array of Colors
     */
    private Color[][] image;
    /**
     * Creates a new Image based on an existing 2D array of colors
     * @param image the array of Colors
     */
    public Image (Color[][] image) {
            this.image = image;
    }
    /**
     * Creates a new Image from an image stored in a file
     * @param file the name of the file to create the Image from
     */
    public Image (String file) {
        // read image and load into array of Colors
        try {
            BufferedImage img = ImageIO.read(new File(file));
            image = new Color[img.getHeight()][img.getWidth()];
            for (int r = 0; r < image.length; r++) {
                for (int c = 0; c < image[r].length; c++) {
                    image[r][c] = new Color(img.getRGB(c, r));
                }
            }
        } catch (IOException e) {  // couldn't open file
            e.printStackTrace();
            System.exit(-1);
        }
    }
    /**
     * Displays a COPY of the image into a Java GUI Window
     * @param title The title to be displayed in the window's title bar
     */
    public void display (String title) {
        new ImageGUI (image, title);
    }
    /**
     *
     * copy - creates and returns a duplicate copy of an image
     *
     * precondition: the image has at least one row and at least one column
     *
     * @return a copy of the image
     */
    public Image copy () {
        Color[][] theCopy = new Color[image.length][image[0].length];
        for (int r=0; r<image.length; r++) {
            for (int c=0; c<image[0].length; c++) {
                theCopy[r][c] = new Color (image[r][c].getRGB ());
            }
        }
        return new Image (theCopy);
    }
    /**
     * removeBlue - modifies an image by removing the blue component form all pixels
     *
     * Postcondition: the image itself is modified
     */
    public void removeBlue() {

        // loop through all pixels
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {

                // get component parts of pixel's color
                Color pixel = image[r][c];
                int red = pixel.getRed ();
                int green = pixel.getGreen ();
                int blue = pixel.getBlue ();

                // construct a new pixel with the same red and green but no blue
                image[r][c] = new Color (red, green, 0);
            }
        }
        return;
    }

    public void removeGreen() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();

                image[r][c] = new Color(red, 0, blue);
            }
        }
    }

    public void removeRed() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                image[r][c] = new Color(0, green, blue);
            }
        }
    }

    public void blackWhite() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length; c++) {
                Color pixel = image[r][c];
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                int average = (red + green + blue) / 3; 
                   image[r][c] = new Color(average, average, average);
            }
        }
    }

    public void invert(){
        for (int r = 0; r < image.length; r++){
            for (int c = 0; c < image[r].length; c++){
                Color pixel = image[r][c];
                int red = 255 - pixel.getRed();
                int green = 255 - pixel.getGreen();
                int blue = 255 - pixel.getBlue();
                image[r][c] = new Color(red, green, blue);
            }
        }
        return;
    }

      public void flipHorizontal() {
        for (int r = 0; r < image.length; r++) {
            for (int c = 0; c < image[r].length / 2; c++) {
                int rightIndex = image[r].length - c -1;
                int leftIndex = c;
                Color rightVal = image[r][rightIndex];
                Color leftVal = image[r][leftIndex];
                image[r][rightIndex] = leftVal;
                image[r][leftIndex] = rightVal;
            }
        }
    }

    public void mirrorVertical() {
        for (int r = 0; r < image.length / 2; r++) {
            for (int c = 0; c < image[r].length; c++) {
                int bottomIndex = image.length - r - 1;
                int topIndex = r;
                Color topVal = image[topIndex][c];
                image[bottomIndex][c] = topVal;
            }
        }
    }

    public void blurImage(){
        Color[][] temporary = image.clone();
        for (int r = 1; r < image.length - 1; r++){
            for (int c = 1; c < image[r].length - 1; c++){
                int red = 0;
                int green = 0;
                int blue = 0;
                for(int rr = r - 1; rr <= r + 1; rr++){
                    for (int cc = c - 1; cc <= c + 1; cc++){
                        red += image[rr][cc].getRed();
                        green += image[rr][cc].getGreen();
                        blue += image[rr][cc].getBlue();
                    }
                }
                red = red / 9;
                green = green / 9;
                blue = blue / 9;
                temporary[r][c] = new Color(red, green, blue);
            }
        }
        image = temporary;
        return;
    }
}


