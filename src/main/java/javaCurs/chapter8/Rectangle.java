package javaCurs.chapter8;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else throw new IllegalArgumentException("Length should be larger than 0.0 and less than 20.0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else throw new IllegalArgumentException("Width should be larger than 0.0 and less than 20.0");
    }

    public double perimeter() {
        return this.length * 2 + this.width * 2;
    }

    public double area() {
        return this.length * this.width;
    }
}
