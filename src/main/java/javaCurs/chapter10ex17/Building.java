package javaCurs.chapter10ex17;

public class Building implements CarbonFootprint{

    private static double cfPerHeatM3 = 5.00;
    private int heatConsumption;

    public Building(int heatConsumption) {
        super();
        this.heatConsumption = heatConsumption;
    }

    public int getHeatConsumption() {
        return heatConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        return heatConsumption * cfPerHeatM3;
    }

    public String toString() {
        return String.format("Building's heat consumption = %d m3", getHeatConsumption());
    }
}
