package Week3;

public class VideoGame {
    String name; 
    double price; 

    VideoGame(String name , double price)
    {
        this.name=name; 
        this.price=price;
    }
    public void playGame()
    {
        System.out.println("The price discount" + name + "is" + price );
    }
    public void applydiscount( double percent)
    {
        price= price-(price*percent/100);
    }
  
    public static void main(String[] args)
    {

        VideoGame game1= new VideoGame("Super mario", 10.8);
        game1.applydiscount(10.0);
        game1.applydiscount(10.0);
        int n=3;
        System.out.println(" The price of " + n + " Copies is $ " + (game1.price*n) );
        game1.playGame();
    }

}