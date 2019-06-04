package javaCurs.chapter10ex13;

public class Cube extends ThreeDimensionalShape{

    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
