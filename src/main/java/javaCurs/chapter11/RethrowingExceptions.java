package javaCurs.chapter11;

import java.io.IOException;

//C11ex20
public class RethrowingExceptions {

    public static void main(String[] args) {

        RethrowingExceptions rethrowingE = new RethrowingExceptions();

        try {
            rethrowingE.someMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void someMethod() throws IOException {
        try {
            someMethod2();
        } catch (IOException exception) {
            throw exception;
        }
    }

    public void someMethod2() throws IOException {
        throw new IOException("Exception from someMethod2");
    }
}
