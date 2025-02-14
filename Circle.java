/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/
// For the comments evaluation, I kept those that missed methods, and removed the ones that were there for indication



public class Circle {
    // Instance variables (data members) of class Circle
    protected double radius; // the radius of the circle
    protected double x; // the x coordinate of the circle's center
    protected double y; // the y coordinate of the circle's center

    // The default constructor with no argument
    public Circle() {
        // Initializing the values of the instance variables
        radius = 1.0;
        x = 0.0;
        y = 0.0;
    }

    // Second constructor with given radius, but origin default
    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    // Overloaded constructor
    public Circle(double r, double ex, double why) {
        radius = r;
        x = ex;
        y = why;
    }

    // A public getter method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public getter method for retrieving the center coordinates
    public double[] getCenter() {
        double[] c = {this.x, this.y};
        return c;
    }

    // A public getter method for computing and returning the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // A public method to compute and return the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // A public method that compares the sizes of two circles
    public boolean isBiggerThan(Circle other) {
        return this.getArea() > other.getArea();
    }

    // A public method that checks if a point is inside the circle
    public boolean containsPoint(double pointX, double pointY) {
        double distanceSquared = Math.pow(pointX - x, 2) + Math.pow(pointY - y, 2);
        return distanceSquared <= Math.pow(radius, 2);
    }

    // A public method to set the radius of the circle
    public void setRadius(double r) {
        radius = r;
    }

    // A public method to set the center of the circle
    public void setCenter(double ex, double why) {
        x = ex;
        y = why;
    }

    // Overridden method toString
    @Override
    public String toString() {
        return "This circle is centered at point (" + x + ", " + y + ") with radius " + radius;
    }

    // Override the method equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.getArea() == other.getArea();
        }
        return false;
    }
}
