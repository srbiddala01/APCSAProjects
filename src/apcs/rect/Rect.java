package apcs.rect;

public class Rect {
    private double height;
    private double width;

    public Rect() {
        width = 0.0;
        height = 0.0;
    }

    public Rect(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public double getDiagonal() {
        double diag = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diag;
    }

    public boolean equals(Rect other) {
        if (this.height == other.getHeight() && this.width == other.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    public double getPerimeter() {
        double perimeter = ((2 * this.width) + (2 * this.height));
        return perimeter;
    }

    public String toString() {
        String info = "Rect:  Width: " + this.width + " Height: " + this.height;
        return info;
    }
}
