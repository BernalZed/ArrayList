
package inventorysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
    static class Item {
        String name;
        int stockCount;

        Item(String name, int stockCount) {
            this.name = name;
            this.stockCount = stockCount;
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory System:");
            System.out.println("1. Add a new item");
            System.out.println("2. Update stock count");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter initial stock count: ");
                    int stockCount = scanner.nextInt();
                    inventory.add(new Item(itemName, stockCount));
                    System.out.println("Item added successfully!");
                    break;

                case 2:
                    System.out.print("Enter item name to update: ");
                    String itemToUpdate = scanner.nextLine();
                    boolean itemFound = false;
                    for (Item item : inventory) {
                        if (item.name.equalsIgnoreCase(itemToUpdate)) {
                            System.out.print("Enter new stock count: ");
                            item.stockCount = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.println("Stock count updated successfully!");
                            itemFound = true;
                            break;
                        }
                    }
                    if (!itemFound) {
                        System.out.println("Item not found!");
                    }
                    break;

                case 3:
                    if (inventory.isEmpty()) {
                        System.out.println("Inventory is empty!");
                    } else {
                        System.out.println("Inventory List:");
                        for (Item item : inventory) {
                            System.out.println("Item: " + item.name + ", Stock Count: " + item.stockCount);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the Inventory System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

