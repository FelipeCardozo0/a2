/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Philip Cardozo
*/
public class Rectangle {
    private double L; 
    private double H; 
    private double x; 
    private double y; 

    
    public Rectangle() {
        L = 1.0;
        H = 1.0;
        x = 0.0;
        y = 0.0;
    }

    
    public Rectangle(double Ell, double Eich, double Ex, double Why) {
        L = Ell;
        H = Eich;
        x = Ex;
        y = Why;
    }

    
    public double getLength() {
        return L;
    }

    
    public double getHeight() {
        return H;
    }

    
    public void setLength(double Ell) {
        L = Ell;
    }

    
    public void setHeight(double Eich) {
        H = Eich;
    }

    
    public double getPerimeter() {
        return 2 * (L + H);
    }

    
    public double getArea() {
        return L * H;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.getArea() == other.getArea();
        }
        return false;
    }
}
