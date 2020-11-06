package e810.pkg;
// @author Michael Kester

public enum TrafficLight {
    // declares constants of enum type
    RED(300),
    GREEN(450),
    YELLOW(30);

    // instance fields
    private final int duration; // duration (seconds) for the TrafficLight

    // enum constructor
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Get Method
    public int getDuration() {
        return duration;
    } // end method getDuration
} // end enum TrafficLight
