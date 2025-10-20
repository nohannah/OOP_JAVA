package Practice1 ;
// TrafficLight.java
public class TrafficLight {
    // Attributes
    private String color;   // e.g., "Red", "Green", "Yellow"
    private int duration;   // duration in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
     // Getter methods
    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }
    // Method to change the color
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    // Method to check if the light is Red
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    // Method to check if the light is Green
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }
  
    // Main method for testing
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);

        System.out.println("Current Light: " + light.getColor() + " (" + light.getDuration() + "s)");

        if (light.isRed()) {
            System.out.println("Stop! The light is red.");
        }

        light.changeColor("Green", 45);

        if (light.isGreen()) {
            System.out.println("Go! The light is green.");
        }

        light.changeColor("Yellow", 5);
        System.out.println("Prepare to stop, the light is " + light.getColor() + ".");
    }
}
