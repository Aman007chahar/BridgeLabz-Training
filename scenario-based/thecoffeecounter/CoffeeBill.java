package thecoffeecounter;

import java.util.Scanner;

public class CoffeeBill {
    private final double GST_RATE = .18;

    public double calculateBill(int price, int quantity){
        return price*quantity;
    }
    public double addGST(double total){
        return total + (total*GST_RATE);
    }
}
