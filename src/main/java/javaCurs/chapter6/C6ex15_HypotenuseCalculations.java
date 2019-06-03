package javaCurs.chapter6;

public class C6ex15_HypotenuseCalculations {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4);
        Triangle triangle2 = new Triangle(5,12);
        Triangle triangle3 = new Triangle(8,15);

        System.out.printf("Triangle nr.1: side1 = %.1f, side2 = %.1f, hypotenuse = %.1f%n",
                triangle1.getSide1(), triangle1.getSide2(), hypotenuse(triangle1.getSide1(), triangle1.getSide2()));
        System.out.printf("Triangle nr.2: side1 = %.1f, side2 = %.1f, hypotenuse = %.1f%n",
                triangle2.getSide1(), triangle2.getSide2(), hypotenuse(triangle2.getSide1(), triangle2.getSide2()));
        System.out.printf("Triangle nr.3: side1 = %.1f, side2 = %.1f, hypotenuse = %.1f%n",
                triangle3.getSide1(), triangle3.getSide2(), hypotenuse(triangle3.getSide1(), triangle3.getSide2()));
    }
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
