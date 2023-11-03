package com.array2d;

class Assign1 {
    int itemId;
    String itemName;
    double itemCost;

    public Assign1(int itemId, String itemName, double itemCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    public void displayItem() {
        System.out.println("Item ID: " + itemId + ", Item Name: " + itemName + ", Item Cost: Rs. " + itemCost);
    }

    public boolean isCostAbove(double threshold) {
        return itemCost > threshold;
    }

    public boolean isCostBelow(double threshold) {
        return itemCost < threshold;
    }

    public void increasePrice(double amount) {
        itemCost += amount;
    }

    public static double calculateAverageCost(Assign1[] items) {
        double totalCost = 0;
        for (Assign1 item : items) {
            totalCost += item.itemCost;
        }
        return totalCost / items.length;
    }

    public static Assign1 findHighestPriceItem(Assign1[] items) {
        Assign1 highestPriceItem = items[0];
        for (Assign1 item : items) {
            if (item.itemCost > highestPriceItem.itemCost) {
                highestPriceItem = item;
            }
        }
        return highestPriceItem;
    }

    public static void main(String[] args) {
        Assign1[] items = new Assign1[5];
        items[0] = new Assign1(1, "Item A", 1500);
        items[1] = new Assign1(2, "Item B", 2500);
        items[2] = new Assign1(3, "Item C", 1800);
        items[3] = new Assign1(4, "Item D", 900);
        items[4] = new Assign1(5, "Item E", 3000);

        // Task 1: Display all items
        System.out.println("All Items:");
        for (Assign1 item : items) {
            item.displayItem();
        }

        // Task 2: Show item names with cost more than Rs. 2000
        System.out.println("Item Names with cost more than Rs. 2000:");
        for (Assign1 item : items) {
            if (item.isCostAbove(2000)) {
                System.out.println(item.itemName);
            }
        }

        // Task 3: Show item details with the highest price
        Assign1 highestPriceItem = Assign1.findHighestPriceItem(items);
        System.out.println("Item with the highest price:");
        highestPriceItem.displayItem();

        // Task 4: Show the average price of all items
        double averagePrice = Assign1.calculateAverageCost(items);
        System.out.println("Average price of all items: Rs. " + averagePrice);

        // Task 5: Increase the item price by Rs. 200 for items with a cost below Rs. 1000
        for (Assign1 item : items) {
            if (item.isCostBelow(1000)) {
                item.increasePrice(200);
            }
        }

        // Display updated item prices
        System.out.println("Updated Item Prices:");
        for (Assign1 item : items) {
            item.displayItem();
        }
    }
}
