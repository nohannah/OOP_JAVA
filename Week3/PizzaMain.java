package Week3;

public class PizzaMain {
    
    public static void main(String[] args) {
        Pizza pizza = new Pizza(5.00); // base price $5

        pizza.addTopping(Toping.CHEESE);
        pizza.addTopping(Toping.PEPPERONI);

        System.out.println(pizza); // will use toString()
    }
}


