package e84.pkg;
// @author Michael Kester

public class RectangleTest {

    public static void main(String[] args) {

        //constructs two Rectangle objects
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();

        //Outputs initial values for everything
        System.out.println("Constructed with:");
        System.out.printf("The length and width of the first rectangle is: "
                + "%.1f (length) and %.1f (width) %n", rec1.getLength(),
                rec1.getWidth());
        System.out.printf("The perimeter and area of the first rectangle is: "
                + "%.1f (perimeter) and %.1f (area) %n", rec1.perimeter(),
                rec1.area());

        System.out.printf("The length and width of the second rectangle is: "
                + "%.1f (length) and %.1f (width) %n", rec2.getLength(),
                rec2.getWidth());
        System.out.printf("The perimeter and area of the second rectangle is: "
                + "%.1f (perimeter) and %.1f (area) %n%n", rec2.perimeter(),
                rec2.area());

        //sets the length and width for the first Rectangle
        rec1.setLength(15.5);
        rec1.setWidth(13.1);

        //sets the length and width for the second Rectangle
        rec2.setLength(21.5);
        rec2.setWidth(-5.4);

        //Outputs new values that were set
        System.out.println("Values are now:");
        System.out.printf("The length and width of the first rectangle is: "
                + "%.1f (length) and %.1f (width) %n", rec1.getLength(),
                rec1.getWidth());
        System.out.printf("The perimeter and area of the first rectangle is: "
                + "%.1f (perimeter) and %.1f (area) %n", rec1.perimeter(),
                rec1.area());

        System.out.printf("The length and width of the second rectangle is: "
                + "%.1f (length) and %.1f (width) %n", rec2.getLength(),
                rec2.getWidth());
        System.out.printf("The perimeter and area of the second rectangle is: "
                + "%.1f (perimeter) and %.1f (area) %n", rec2.perimeter(),
                rec2.area());
    }
}
