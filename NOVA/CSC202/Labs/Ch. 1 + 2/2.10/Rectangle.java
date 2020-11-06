package e210.pkg;

// @author Michael Kester
public class Rectangle implements FigureGeometry {

    float length, width;
    int scale;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float perimeter() {
        return (2 * (length + width));
    }

    @Override
    public float area() {
        return length * width;
    }

    @Override
    public void setScale(int scale) // Scale of this figure is set to "scale".
    {
        this.scale = scale;
    }

    @Override
    public float weight() // Precondition: Scale of this figure has been set.
    //
    // Returns weight of this figure. Weight = area X scale.
    {
        return (this.area() * scale);
    }

}
