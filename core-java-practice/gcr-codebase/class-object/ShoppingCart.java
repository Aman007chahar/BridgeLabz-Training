public class ShoppingCart {

    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        void addItem(int qty) {
            quantity += qty;
            System.out.println("Added " + qty + " of " + itemName + " to the cart.");
        }

        void removeItem(int qty) {
            if (qty <= quantity) {
                quantity -= qty;
                System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
            }
        }

        double totalCost() {
            return price * quantity;
        }

        void display() {
            System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);

        item.display();
        item.addItem(2);
        item.removeItem(1);
        System.out.println("Total cost: $" + item.totalCost());
    }
}
