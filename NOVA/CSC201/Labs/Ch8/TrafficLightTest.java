package e810.pkg;
// @author Michael

public class TrafficLightTest {

    public static void main(String[] args) {
        // Initial output
        System.out.printf("%-10s%10s%n%n", "Light", "Duration");

        // outputs all lights in enum TrafficLight
        for (TrafficLight trafficLight : TrafficLight.values()) {
            System.out.printf("%-10s%10d%n", trafficLight,
                    trafficLight.getDuration());
        }
    }
}
