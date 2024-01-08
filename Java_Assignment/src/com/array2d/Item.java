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

    public void displayItem() {
        System.out.println("Item ID: " + itemId + ", Item Name: " + itemName + ", Item Cost: Rs. " + itemCost);
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
        System.out.println("Supplier ID: " + supId + ", Supplier Name: " + supName);
        System.out.println("Items Supplied:");
        for (Item item : itemsSupplied) {
            item.displayItem();
        }
        System.out.println();
    }


public static class SupplierItemAssociation {
    public static void main(String[] args) {
        // Create two arrays of Item
        Item[] itemsSupplier1 = new Item[5];
        itemsSupplier1[0] = new Item(1, "Item A", 1500);
        itemsSupplier1[1] = new Item(2, "Item B", 2500);
        itemsSupplier1[2] = new Item(3, "Item C", 1800);
        itemsSupplier1[3] = new Item(4, "Item D", 900);
        itemsSupplier1[4] = new Item(5, "Item E", 3000);

        Item[] itemsSupplier2 = new Item[5];
        itemsSupplier2[0] = new Item(6, "Item F", 2200);
        itemsSupplier2[1] = new Item(7, "Item G", 1600);
        itemsSupplier2[2] = new Item(8, "Item H", 1100);
        itemsSupplier2[3] = new Item(9, "Item I", 2800);
        itemsSupplier2[4] = new Item(10, "Item J", 1950);

        // Create two Supplier objects
        Supplier supplier1 = new Supplier(101, "Supplier X", itemsSupplier1);
        Supplier supplier2 = new Supplier(102, "Supplier Y", itemsSupplier2);

        // Task 2: Show item details supplied by each supplier
        supplier1.displaySuppliedItems();
        supplier2.displaySuppliedItems();
        
    }
}
}