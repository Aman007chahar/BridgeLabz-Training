package encapsulation;

public abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String name, double price, int qty) {
        itemName = name;
        this.price = price;
        quantity = qty;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (price * quantity) + 50;
    }

    public double applyDiscount() {
        return 20;
    }

    public String getDiscountDetails() {
        return "Flat ₹20 off";
    }
}
