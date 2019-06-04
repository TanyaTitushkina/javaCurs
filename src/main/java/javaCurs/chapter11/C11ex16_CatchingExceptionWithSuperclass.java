package javaCurs.chapter11;

public class C11ex16_CatchingExceptionWithSuperclass {
    public static void main(String[] args) {

        try {
            throw new ExceptionA("ExceptionA");
        } catch (ExceptionA eA) {
            System.out.println(eA.getMessage());
        }

        try {
            throw new ExceptionB("ExceptionB");
        } catch (ExceptionA eA) {
            System.out.println(eA.getMessage());
        }

        try {
            throw new ExceptionC("ExceptionC");
        } catch (ExceptionA eA) {
            System.out.println(eA.getMessage());
        }
    }
}
