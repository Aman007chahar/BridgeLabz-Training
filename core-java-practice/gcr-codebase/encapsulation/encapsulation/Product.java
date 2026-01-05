package encapsulation;

public abstract class Product {
    private int productId;
    private String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();
}
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }

    public String getTaxDetails() {
        return "GST 18%";
    }
}
class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() {
        return price * 0.20;
    }
}
