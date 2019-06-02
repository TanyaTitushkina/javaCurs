package javaCurs.chapter4;

public class C4ex22_TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\t\t10*N\t100*N\t1000*N\n"); //header

        for(int n = 1; n <= 5; n++) {
            System.out.println(n + "\t\t" + (n * 10) + "\t\t" + (n * 100) + "\t\t" + (n * 1000));
        }
    }
}
