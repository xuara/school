package e1118.pkg;
// @author Michael Kester

import java.io.*;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            throw new IOException();
        } // superclass exception
        catch (Exception exception) {
            exception.printStackTrace();
        } // subclass exception
        catch (IOException ioexception) {
            System.err.println("IOException");
        }
    }
}// end class ExceptionTest
