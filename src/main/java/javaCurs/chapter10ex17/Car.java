package javaCurs.chapter10ex17;

public class Car implements CarbonFootprint{

    private static double cfPerLiter = 2.5;
    private double litresPerKm;
    private double mileageKm;

    public Car(double litresPerKm, double mileageKm) {
        this.litresPerKm = litresPerKm;
        this.mileageKm = mileageKm;
    }

    public double getLitresPerKm() {
        return litresPerKm;
    }

    public double getMileageKm() {
        return mileageKm;
    }

    @Override
    public double getCarbonFootprint() {
        return mileageKm * litresPerKm * cfPerLiter;
    }

    public String toString() {
        return String.format("Car's gas consumption = %.2f per km and total mileage = %.2f km", getLitresPerKm(), getMileageKm());
    }
}
