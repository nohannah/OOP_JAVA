package CarSystemManagement;
import java.util.ArrayList;

// CarDealership.java - Manages car inventory
public class CarDealership {
    private ArrayList<Car> inventory;

    public CarDealership() {
        this.inventory = new ArrayList<>();
    }

    public void addCar(Car car) {
        inventory.add(car);
    }

    public void listInventory() {
        System.out.println("--- Dealership Inventory ---");
        for (int i = 0; i < inventory.size(); i++) {
            Car car = inventory.get(i);
            System.out.println((i + 1) + ". " + car.getMake() + " " + car.getModel() + 
                             " - " + car.getColor() + " - $" + car.getPrice());
        }
    }

    public int getInventorySize() {
        return inventory.size();
    }

    public Car getCar(int index) {
        if (index >= 0 && index < inventory.size()) {
            return inventory.get(index);
        }
        return null;
    }
}