package com.array2d;

public class a1 extends SupplierItemAssociation{
    int itemId;
    String itemName;
    double itemCost;

    public a1(int itemId, String itemName, double itemCost) {
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
