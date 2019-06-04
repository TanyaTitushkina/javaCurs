package javaCurs.chapter10ex13;

public class Tetrahedron extends ThreeDimensionalShape {

    private double edgeLength;

    public Tetrahedron(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3 * Math.pow(edgeLength, 2));
    }

    @Override
    public double getVolume() {
        return (2 * Math.pow(edgeLength, 2)) / 12;
    }
}
