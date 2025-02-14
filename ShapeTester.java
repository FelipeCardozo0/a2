/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

public class ShapeTester {
    
    public static boolean isLarger(Circle circle, Rectangle rectangle) {
        return circle.getArea() >= rectangle.getArea();
    }

    
    public static double longerPerim(Circle circle, Rectangle rectangle) {
        double circlePerimeter = circle.getCircumference();
        double rectanglePerimeter = rectangle.getPerimeter();
        return Math.max(circlePerimeter, rectanglePerimeter);
    }

    
    public static double longerPerim(Rectangle rectangle, Circle circle) {
        return longerPerim(circle, rectangle);
    }

    
    public static double largerArea(Circle circle, Rectangle rectangle) {
        return Math.max(circle.getArea(), rectangle.getArea());
    }

    
    public static double largerArea(Rectangle rectangle, Circle circle) {
        return largerArea(circle, rectangle);
    }

    
    public static boolean containsCenter(Circle circle1, Circle circle2) {
        double[] center1 = circle1.getCenter();
        double[] center2 = circle2.getCenter();
        double distanceSquared = Math.pow(center2[0] - center1[0], 2) + Math.pow(center2[1] - center1[1], 2);
        double radiusSquared = Math.pow(circle1.getRadius(), 2);
        return distanceSquared <= radiusSquared;
    }
}
