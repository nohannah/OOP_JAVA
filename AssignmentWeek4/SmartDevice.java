package AssignmentWeek4;

public class SmartDevice {
    protected String name ; 
    protected boolean isOn;

    public SmartDevice(String name)
    {
        this.name=name;
        this.isOn= false;
    }
    public void turnOn()
    {
        isOn=true ; 
        System.put.println(name + "is turned On.");

    }
     public void turnOn()
    {
        isOn=false ; 
        System.put.println(name + "is turne off");

    }
    public void showStatus()
    {

    System.out.println(name + " status: " + (isOn ? "ON" : "OFF"));

    }
}
class Thermostat extends SmartDevice(String name , int temperature)
    {
        super(name);
        this.temperature= temperature;
    }
    public void setTemperature(int temp)
    {
        if(isOn)
        {
            temperature=temp;
            System.out.println( name + "temperature set to " + temp + "Celcius");

        }
        else 
        {
            System.out.println(name + "is OFF, cannot set the remperature.");
        }
    }
    @Override
    public void showStatus()
    {
    System.out.println("Thermostat \"" + name + "\" is " + (isOn ? "ON, Temp: " + temperature + "°C" : "OFF"));
 
    }

    class SecurityCamera extends SmartDevice
    {
        public SecurityCamera(String name)
        {
            super(name);

        }
        public void recordVideo()
        {
            if(isOn)
                System.out.println(name + " is recording video...");
            else
                System.out.println(name + " is OFF. Cannot record.");
        }
    
        @Override
        public void showStatus() {
        System.out.println("Security Camera \"" + name + "\" is " + (isOn ? "Active" : "Inactive"));
        }
    }

    //main class
public void SmartHomeSystem
{
    public static void main(String[] args)
    {
        SmartDevice[] devices = 
        {
            new Light("Living room light"),
            new Thermostat("Main Thermostat" , 24),
            new SecurityCamera("Front door camera")
        };
    }
}
