package javaCurs.chapter10ex13;

public class ShapeTest {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Square(3.0);
        shapes[2] = new Triangle(4.0, 5.0);
        shapes[3] = new Sphere(2.0);
        shapes[4] = new Cube(3.0);
        shapes[5] = new Tetrahedron(4.0);

        for(Shape shape : shapes) {

            String pack = shape.getClass().getPackage().toString().substring("package ".length());

            if (shape.getClass().getName().contains(pack)) {
                System.out.print(shape.getClass().getName().substring((pack + ".").length()));
            } else {
                System.out.print(shape.getClass().getName());
            }

            if(shape instanceof TwoDimensionalShape) {
                System.out.println(" is a TwoDimensionalShape");
                System.out.printf("area = %.2f%n%n", shape.getArea());
            }

            if(shape instanceof ThreeDimensionalShape) {
                System.out.println(" is a ThreeDimensionalShape");
                System.out.printf("area = %.2f%n", shape.getArea());
                System.out.printf("volume = %.2f%n%n", ((ThreeDimensionalShape) shape).getVolume());
            }
        }
    }
}
