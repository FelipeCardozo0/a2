/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/
public class Sphere extends Circle {
    private double z; 

    // Default constructor
    public Sphere() {
        super(); 
        z = 0.0;
    }

    
    public Sphere(double x, double y, double z, double radius) {
        super(radius, x, y); 
        this.z = z;
    }

    
    @Override
    public double[] getCenter() {
        return new double[]{x, y, z};
    }

    
    public void setCenter(double x, double y, double z) {
        super.setCenter(x, y); 
        this.z = z;
    }

    
    @Override
    public double getArea() {
        return 4 * super.getArea(); 
    }


    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
