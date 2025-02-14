/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/
public class Circle {
    protected double radius;     protected double x; 
    protected double y; 

        public Circle() {
  
        radius = 1.0;
        x = 0.0;
        y = 0.0;
    }

    
    public Circle(double r) {
        radius = r;
        x = 0.0;
        y = 0.0;
    }

    
    public Circle(double r, double ex, double why) {
        radius = r;
        x = ex;
        y = why;
    }

    
    public double getRadius() {
        return radius;
    }





    
    
    public double[] getCenter() {
        double[] c = {this.x, this.y};
        return c;
    }

    
    public double getArea() {
        return radius * radius * Math.PI;
    }

    
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    
    public boolean isBiggerThan(Circle other) {
        return this.getArea() > other.getArea();
    }

    
    public boolean containsPoint(double pointX, double pointY) {
        double distanceSquared = Math.pow(pointX - x, 2) + Math.pow(pointY - y, 2);
        return distanceSquared <= Math.pow(radius, 2);
    }

    
    public void setRadius(double r) {
        radius = r;
    }

    
    public void setCenter(double ex, double why) {
        x = ex;
        y = why;
    }

    
    @Override
    public String toString() {
        return "This circle is centered at point (" + x + ", " + y + ") with radius " + radius;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.getArea() == other.getArea();
        }
        return false;
    }
}
