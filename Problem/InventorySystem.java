package Problem;
import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        HashSet<String> productCodes = new HashSet<>();
        HashMap<String, InventoryItem> inventoryMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Inventory Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Search Item by Product Code");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if(choice == 1){
                System.out.print("Enter Product Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter Product Code: ");
                String code = scanner.nextLine();
                if(productCodes.contains(code)){
                    System.out.println("Product Code already exists. Item not added.");
                } else {
                    InventoryItem item = new InventoryItem(name, price, code);
                    inventory.add(item);
                    productCodes.add(code);
                    inventoryMap.put(code, item);
                    System.out.println("Item added successfully.");
                }
            } else if(choice == 2){
                for(InventoryItem item : inventory){
                    item.displayDetails();
                }
            } else if(choice == 3){
                System.out.print("Enter Product Code to search: ");
                String code = scanner.nextLine();
                if(inventoryMap.containsKey(code)){
                    inventoryMap.get(code).displayDetails();
                } else {
                    System.out.println("Item not found.");
                }
            } else if(choice == 4){
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
