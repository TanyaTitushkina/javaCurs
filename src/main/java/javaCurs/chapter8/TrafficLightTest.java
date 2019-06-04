package javaCurs.chapter8;

import java.util.EnumSet;

public class TrafficLightTest {

    public static void main(String[] args) {

        //display all values
        for(TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + " = " + light.getDuration() + " sec");
        }

        //display values from specified range
        System.out.println();
        for(TrafficLight light : EnumSet.range(TrafficLight.GREEN, TrafficLight.YELLOW)) {
            System.out.println(light.name() + " = " + light.getDuration() + " sec");
        }

        //display 1 specific value from enum
        System.out.println("\n" + TrafficLight.RED.name() + " = " + TrafficLight.RED.getDuration() + " sec");
    }
}
