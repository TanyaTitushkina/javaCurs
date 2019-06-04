package javaCurs.chapter8;

public enum TrafficLight {
    RED(50),
    GREEN(70),
    YELLOW(4);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
