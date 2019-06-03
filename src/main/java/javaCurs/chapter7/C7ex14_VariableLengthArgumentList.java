package javaCurs.chapter7;

public class C7ex14_VariableLengthArgumentList {

    public static void main(String[] args) {
        System.out.println(product(1, 2, 3, 4, 5, 6));
        System.out.println(product(2, 3, 4, 5));
        System.out.println(product(10, 10, 10));
        System.out.println(product(3, 7));
        System.out.println(product());
    }

    public static int product(int... numbers) {
        int prod = 0;

        if(numbers.length != 0) {
            prod = 1;
            for(int num : numbers) {
                prod *= num;
            }
        }
        return prod;
    }
}
