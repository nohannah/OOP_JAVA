package Week3;

public enum Toping {
    CHEESE(1.50),
    PEPPERONI(2.00),
    MUSHROOM(1.20),
    ONION(1.00),
    OLIVES(1.30),
    CHICKEN(2.50);

    private final double price; 
    
    Toping (double price)
    {
         this.price = price;   
    }
    public double getprice()
    {
        return price;
    }
}
