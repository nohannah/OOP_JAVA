package Week3;

class Videogame
{
    String name;
    int price;

    // Constructor
    Videogame(String name, int price)
    {
        this.name= name;
        this.price=price;
    }
    // Method 
    void showDetail()
    {
        System.out.println("Model:" + name + " price:" + price);
    }
}

public class Main{
    public static void main(String[] args)
    {
        Videogame game= new Videogame("Fifa" , 3000);
        game.showDetail();
    }
}
