package e1120.pkg;
// @author Michael

public class RethrowExceptionsTest {

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception exception) {
            throw exception; // rethrows the exception
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.exit(0);
    }
}
