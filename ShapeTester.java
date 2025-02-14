/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/
// For the comments evaluation, I kept those that missed methods, and removed the ones that were there for indication

public class ShapeTester {
    // Method to check if the area of the circle is larger than or equal to the area of the rectangle
    public static boolean isLarger(Circle circle, Rectangle rectangle) {
        return circle.getArea() >= rectangle.getArea();
    }

    // Method to return the longer perimeter between a circle and a rectangle
    public static double longerPerim(Circle circle, Rectangle rectangle) {
        double circlePerimeter = circle.getCircumference();
        double rectanglePerimeter = rectangle.getPerimeter();
        return Math.max(circlePerimeter, rectanglePerimeter);
    }

    // Overloaded method to return the longer perimeter between a rectangle and a circle
    public static double longerPerim(Rectangle rectangle, Circle circle) {
        return longerPerim(circle, rectangle);
    }

    // Method to return the larger area between a circle and a rectangle
    public static double largerArea(Circle circle, Rectangle rectangle) {
        return Math.max(circle.getArea(), rectangle.getArea());
    }

    // Overloaded method to return the larger area between a rectangle and a circle
    public static double largerArea(Rectangle rectangle, Circle circle) {
        return largerArea(circle, rectangle);
    }

    // Method to check if the first circle contains the center of the second circle
    public static boolean containsCenter(Circle circle1, Circle circle2) {
        double[] center1 = circle1.getCenter();
        double[] center2 = circle2.getCenter();
        double distanceSquared = Math.pow(center2[0] - center1[0], 2) + Math.pow(center2[1] - center1[1], 2);
        double radiusSquared = Math.pow(circle1.getRadius(), 2);
        return distanceSquared <= radiusSquared;
    }
}
