/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/

//comments that follow the 2. Implement Inheritance
public class Sphere extends Circle {
    private double z; 
    
//  2nd bulletpoint: constructors
    public Sphere() {
        super(); 
        z = 0.0;
    }

//1st bulletpoint
    public Sphere(double x, double y, double z, double radius) {
        super(radius, x, y); 
        this.z = z;
    }
//3rd bulletpoint
    @Override
    public double[] getCenter() {
        return new double[]{x, y, z};
    }

 //4th bulletpoint   
    public void setCenter(double x, double y, double z) {
        super.setCenter(x, y); 
        this.z = z;
    }

    //5th bulletpoint
    @Override
    public double getArea() {
        return 4 * super.getArea(); 
    }

//6th and last bulletpoint
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}
