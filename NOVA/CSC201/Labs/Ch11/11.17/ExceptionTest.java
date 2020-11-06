package e1117.pkg;
// @author Michael Kester

import java.io.*;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            getExceptionA();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            getExceptionB();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            getNullPointerException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            getIOException();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void getNullPointerException() throws NullPointerException {
        throw new NullPointerException("Null pointer exception");
    }

    public static void getIOException() throws IOException {
        throw new IOException("IOException");
    }
}
