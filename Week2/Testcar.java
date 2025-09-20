package Week2;

public class Testcar {
    public static void main (String[] args)
    {
        Car car1 = new Car("Toyota" , "Camry" , 2020 , "White");
        Car car2 = new Car("Honda" , "Civic" , 2019 , "Black");

        System.out.println(car1);
        System.out.println(car2);
        car1.startCar();
        car2.startCar( );
    
    }
    
}
