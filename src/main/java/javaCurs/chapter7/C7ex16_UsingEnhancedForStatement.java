package javaCurs.chapter7;

public class C7ex16_UsingEnhancedForStatement {

    public static void main(String[] args) {
        double sum = 0;

        if(args.length > 0) {
            for(String arg : args) {
                sum += Double.parseDouble(arg);
            }
        } else {
            System.out.println("args[] is empty");
        }

        System.out.println("Sum of command line arguments = " + sum);
    }
}
