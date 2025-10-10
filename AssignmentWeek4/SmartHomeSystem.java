package AssignmentWeek4;
// Base class
class SmartDevice {
    protected String name;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned OFF.");
    }

    // Polymorphic behavior (can be overridden by subclasses)
    public void showStatus() {
        System.out.println(name + " status: " + (isOn ? "ON" : "OFF"));
    }
}

// Subclass for Light
class Light extends SmartDevice {
    public Light(String name) {
        super(name);
    }

    public void dimLight() {
        if (isOn)
            System.out.println(name + " is dimmed to 50% brightness.");
        else
            System.out.println(name + " is OFF. Cannot dim.");
    }

    @Override
    public void showStatus() {
        System.out.println("Light \"" + name + "\" is currently " + (isOn ? "ON" : "OFF"));
    }
}

// Subclass for Thermostat
class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    public void setTemperature(int temp) {
        if (isOn) {
            temperature = temp;
            System.out.println(name + " temperature set to " + temp + "°C");
        } else {
            System.out.println(name + " is OFF. Cannot set temperature.");
        }
    }

    @Override
    public void showStatus() {
        System.out.println("Thermostat \"" + name + "\" is " + (isOn ? "ON, Temp: " + temperature + "°C" : "OFF"));
    }
}

// Subclass for Security Camera
class SecurityCamera extends SmartDevice {
    public SecurityCamera(String name) {
        super(name);
    }

    public void recordVideo() {
        if (isOn)
            System.out.println(name + " is recording video...");
        else
            System.out.println(name + " is OFF. Cannot record.");
    }

    @Override
    public void showStatus() {
        System.out.println("Security Camera \"" + name + "\" is " + (isOn ? "Active" : "Inactive"));
    }
}

// Main class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Polymorphic list of SmartDevices
        SmartDevice[] devices = {
            new Light("Living Room Light"),
            new Thermostat("Main Thermostat", 24),
            new SecurityCamera("Front Door Camera")
        };

        // Control all devices using polymorphism
        for (SmartDevice device : devices) {
            device.turnOn();
            device.showStatus();
            System.out.println();
        }

        // Device-specific actions using type checking
        for (SmartDevice device : devices) {
            if (device instanceof Light) {
                ((Light) device).dimLight();
            } else if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(22);
            } else if (device instanceof SecurityCamera) {
                ((SecurityCamera) device).recordVideo();
            }
        }

        System.out.println("\nTurning off all devices...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
