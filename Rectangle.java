/* THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Your_Name_Here */

// This class represents a rectangle shape
public class Rectangle {
    private double L; // the length of the rectangle
    private double H; // the height of the rectangle
    private double x; // the x coordinate of the bottom left corner of the rectangle
    private double y; // the y coordinate of the bottom left corner of the rectangle

    // A default constructor that creates a rectangle with side lengths 1 at (0.0, 0.0)
    public Rectangle() {
        L = 1.0;
        H = 1.0;
        x = 0.0;
        y = 0.0;
    }

    // A constructor that takes all four inputs
    public Rectangle(double Ell, double Eich, double Ex, double Why) {
        L = Ell;
        H = Eich;
        x = Ex;
        y = Why;
    }

    // A public method to get the length of the rectangle
    public double getLength() {
        return L;
    }

    // A public method to get the height of the rectangle
    public double getHeight() {
        return H;
    }

    // A public method to set the length of the rectangle
    public void setLength(double Ell) {
        L = Ell;
    }

    // A public method to set the height of the rectangle
    public void setHeight(double Eich) {
        H = Eich;
    }

    // A public method to compute and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (L + H);
    }

    // A public method to compute and return the area of the rectangle
    public double getArea() {
        return L * H;
    }

    // Override the method equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.getArea() == other.getArea();
        }
        return false;
    }
}
