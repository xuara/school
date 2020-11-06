package e1119.pkg;
// @author M. Kester

public class SomeClass {

    int x;

    public SomeClass(int x) throws Exception {
        this.x = x;
        if (x != 1) {
            throw new Exception();
        } else {
            System.out.println("No exception thrown.");
        }
    }

    public static void main(String[] args) {

        try {
            SomeClass e = new SomeClass(0);
        } catch (Exception exception) {
            System.out.println("Exception type: " + exception);
        }

        try {
            SomeClass e = new SomeClass(1);
        } catch (Exception exception) {
            System.out.println("Exception type: " + exception);
        }
    }
}
