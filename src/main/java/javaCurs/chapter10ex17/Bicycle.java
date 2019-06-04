package javaCurs.chapter10ex17;

public class Bicycle implements CarbonFootprint{

    private static double cfPerMile = 0.01;
    private double mileage;

    public Bicycle(double mileage) {
        super();
        this.mileage = mileage;
    }

    public double getMileage() {
        return this.mileage;
    }

    @Override
    public double getCarbonFootprint() {
        return mileage * cfPerMile;
    }

    public String toString() {
        return String.format("Bicycle's mileage = %.2f miles", getMileage());
    }
}
