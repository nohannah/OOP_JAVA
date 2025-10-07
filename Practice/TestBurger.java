package Practice;


// Enum for burger sizes
enum Size {
    SMALL,
    MEDIUM,
    LARGE;
}

// Enum for burger meat types
enum Meat {
    BEEF,
    CHICKEN,
    PORK;
}

// Burger class
class Burger {
    private Meat meat;
    private Size size;

    // Default constructor
    public Burger() {
        this.meat = Meat.BEEF;
        this.size = Size.MEDIUM;
    }

    // Parameterized constructor
    public Burger(Meat meat, Size size) {
        this.meat = meat;
        this.size = size;
    }

    // Getter and Setter for meat
    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    // Getter and Setter for size
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    // Display burger details
    public void displayBurger() {
        System.out.println("Burger Details:");
        System.out.println("Meat: " + meat);
        System.out.println("Size: " + size);
        System.out.println("-----------------------");
    }
}

// Main class to test
public class TestBurger {
    public static void main(String[] args) {
        // Using default constructor
        Burger defaultBurger = new Burger();
        defaultBurger.displayBurger();

        // Using parameterized constructor
        Burger customBurger = new Burger(Meat.CHICKEN, Size.LARGE);
        customBurger.displayBurger();

        // Using setters
        Burger anotherBurger = new Burger();
        anotherBurger.setMeat(Meat.PORK);
        anotherBurger.setSize(Size.SMALL);
        anotherBurger.displayBurger();
    }
}
