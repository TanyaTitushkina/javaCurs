package javaCurs.chapter2;

public class C2ex31 {

    public static void main(String[] args){

        System.out.printf("number\tsquare\tcube%n");
        for(int i = 0; i <= 10; i++) {
            if (i<10 && i*i < 10){
                System.out.printf("%d      \t%d      \t%d%n", i, i*i, i*i*i);
            } else {
                System.out.printf("%d     \t%d  \t%d%n", i, i*i, i*i*i);
            }
        }
    }
}
