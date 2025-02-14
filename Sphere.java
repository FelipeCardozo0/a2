/* THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Your_Name_Here */

// This class represents a sphere shape and extends the Circle class
public class Sphere extends Circle {
    private double z; // the z coordinate of the sphere's center

    // Default constructor
    public Sphere() {
        super(); // Calls the default constructor of Circle
        z = 0.0;
    }

    // Constructor with x, y, z coordinates and radius
    public Sphere(double x, double y, double z, double radius) {
        super(radius, x, y); // Calls the overloaded constructor of Circle
        this.z = z;
    }

    // Override getCenter to return the 3D center as an array of doubles
    @Override
    public double[] getCenter() {
        return new double[]{x, y, z};
    }

    // Overload setCenter to set the 3D center
    public void setCenter(double x, double y, double z) {
        super.setCenter(x, y); // Calls the setCenter method of Circle
        this.z = z;
    }

    // Override getArea to return the surface area of the sphere
    @Override
    public double getArea() {
        return 4 * super.getArea(); // Surface area of a sphere is 4 * area of a circle
    }

    // Method to compute and return the volume of the sphere
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
