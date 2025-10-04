// 12. Write a Java program to create a class called "Airplane" with a flight number,
//  destination, and departure time attributes, and methods to check flight status and delay.
package Practice;

public class Airplance {
    private String Duration;
    private int departureTime;
    private String flightNumber;
    private int delayTime;

    public Airplance(String flightNumber , String Duration, int departureTime, int delayTime )
    {
        this.Duration=Duration;
        this.departureTime= departureTime;
        this.flightNumber= flightNumber;
        this.delayTime=0;
    }
    public String getDuration()
    {
        return Duration;
    }
    public int getDepartureTime()
    {
        return departureTime;
    }
    public String getflightNumber()
    {
        return flightNumber;
    }
    public int delayTime()
    {
        return delayTime;
    }
}
