package e84.pkg;
// @author Michael Kester

public class Rectangle {

    private double length = 1.0; //instance variable, defaulted to 1.0
    private double width = 1.0; //instance variable, defaulted to 1.0

    // Set Methods
    // validates and sets the length
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    // validates and sets the width
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        }
    }

    // Get Methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // method to calculate area
    public double area() {
        double area = length * width;
        return area;
    }

    // method to calculate perimeter
    public double perimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    } //end method perimeter
} //end class Rectangle
