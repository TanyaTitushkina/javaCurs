package javaCurs.chapter11;

import java.io.IOException;

public class C11ex17_CatchingExceptionUsingClassException {

    public static String str;

    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA exception");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB exception");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        //IOException
        try {
            throw new IOException("Input or Output operation is failed");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }

        //NullPointerException
        try {
            str.equals("testStr");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("NullPointerException: String 'str' is " + str);
        }
    }
}

