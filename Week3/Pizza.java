package Week3;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private double basePrice;
    private List<Toping> topings;

    public Pizza (double basePrice)
    {
        this.basePrice=basePrice;
        this.topings= new ArrayList<>();

    }
    public void addTopping(Toping toping) {
        topings.add(toping);
    }
    public void removeToping(Toping toping)
    {
        topings.remove(toping);
    }

    public double calculateTotalprice()
    {
        double total = basePrice;
        for( Toping t : topings)
        {
            total+= t.getprice();
        }
        return total;
    }
    @Override
    public String toString()
    {
        return "Pizza with topping: " + topings +
        " Base price:  $" + basePrice + "Total price $" + calculateTotalprice();
    }
}


