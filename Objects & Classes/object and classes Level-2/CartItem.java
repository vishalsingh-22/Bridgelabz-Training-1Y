class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        } else {
            System.out.println("Not enough quantity to remove!");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
