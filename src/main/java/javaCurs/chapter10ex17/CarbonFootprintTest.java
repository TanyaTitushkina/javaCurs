package javaCurs.chapter10ex17;

import java.util.ArrayList;

public class CarbonFootprintTest {

    public static void main(String[] args) {

        Building building = new Building(1600);
        Car car = new Car(0.09, 1000);
        Bicycle bicycle = new Bicycle(200);

        ArrayList<CarbonFootprint> carbonFootprint = new ArrayList();
        carbonFootprint.add(building);
        carbonFootprint.add(car);
        carbonFootprint.add(bicycle);

        for(CarbonFootprint cf: carbonFootprint) {
            System.out.println(cf);
            System.out.printf("CO2 release = %.2f kg%n", cf.getCarbonFootprint());
            System.out.println();
        }
    }
}
