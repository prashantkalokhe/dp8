package com.array2d;

class Item {
    int itemId;
    String itemName;
    double itemCost;

    public Item(int itemId, String itemName, double itemCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Cost: Rs. " + itemCost);
    }
}

class Supplier {
    int supId;
    String supName;
    Item[] itemsSupplied;

    public Supplier(int supId, String supName, Item[] itemsSupplied) {
        this.supId = supId;
        this.supName = supName;
        this.itemsSupplied = itemsSupplied;
    }

    public void displaySuppliedItems() {
        System.out.println("Supplier ID: " + supId);
        System.out.println("Supplier Name: " + supName);
        System.out.println("Items Supplied by " + supName + ":");
        for (Item item : itemsSupplied) {
            item.displayItemDetails();
            System.out.println(); // Separate item details
        }
    }
}

public class SupplierItemAssociation {

    public static void main(String[] args) {
        // Create two arrays of Item
        Item[] itemsSupplier1 = createItemsArray(1);
        Item[] itemsSupplier2 = createItemsArray(2);

        // Create two Supplier objects
        Supplier supplier1 = new Supplier(101, "Supplier X", itemsSupplier1);
        Supplier supplier2 = new Supplier(102, "Supplier Y", itemsSupplier2);

        // Task 2: Show item details supplied by each supplier
        supplier1.displaySuppliedItems();
        supplier2.displaySuppliedItems();
    }

    public static Item[] createItemsArray(int supplierId) {
        Item[] items = new Item[5];
        for (int i = 0; i < items.length; i++) {
            int itemId = (supplierId - 1) * 5 + i + 1;
            String itemName = "Item " + (char) ('A' + i);
            double itemCost = 1000 + (supplierId - 1) * 100 + (i * 100);
            items[i] = new Item(itemId, itemName, itemCost);
        }
        return items;
    }
}
